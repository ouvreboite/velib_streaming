package fr.velinfo.kafka.sink;

import fr.velinfo.kafka.stream.AvroSerdeBuilder;
import fr.velinfo.repository.Repository;
import org.apache.avro.specific.SpecificRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.Serdes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class DbSink<V extends SpecificRecord> {
    private static final Logger LOGGER = LoggerFactory.getLogger(DbSink.class);
    private final KafkaConsumer<String, V> consumer;
    private final Repository<V> repository;
    private final String topic;

    public DbSink(String topic, Repository<V> repository, Properties props, AvroSerdeBuilder avroSerdeBuilder) {
        this.consumer = initConsumer(props, avroSerdeBuilder);
        this.topic = topic;
        this.repository = repository;
    }

    public void pollAndSink() {
        try {
            consumer.subscribe(Collections.singletonList(topic));

            while(true){
                ConsumerRecords<String, V> records = consumer.poll(Duration.ofSeconds(5));
                List<V> objects = extractValues(records);
                LOGGER.info("Sinking {} records into {}", objects.size(),repository.getClass());
                try{
                    repository.persist(objects);
                    consumer.commitSync();
                }catch(Repository.RepositoryException e){
                    LOGGER.error("Error sinking "+repository.getClass(), e);
                }
            }
        } finally {
            consumer.close();
        }
    }

    private List<V> extractValues(ConsumerRecords<String, V> records) {
        List<V> objects = new ArrayList<>();
        for (ConsumerRecord<String, V> record : records) {
            objects.add(record.value());
        }
        return objects;
    }

    private KafkaConsumer<String, V> initConsumer(Properties props, AvroSerdeBuilder avroSerdeBuilder) {
        var kafkaConsumer = new KafkaConsumer<>(props, Serdes.String().deserializer(), avroSerdeBuilder.<V>avroSerde().deserializer());
        Runtime.getRuntime().addShutdownHook(new Thread(kafkaConsumer::close, "Shutdown-thread"));
        return kafkaConsumer;
    }

}
