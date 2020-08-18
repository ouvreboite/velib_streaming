package velibstreaming.kafka.stream.builder.deduplication;

import org.apache.kafka.streams.kstream.ValueTransformerWithKey;
import org.apache.kafka.streams.processor.ProcessorContext;
import org.apache.kafka.streams.state.KeyValueStore;
import velibstreaming.avro.record.source.AvroBicycleCount;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class CountUpdateDeduplicater implements ValueTransformerWithKey<String, AvroBicycleCount, AvroBicycleCount> {

    private KeyValueStore<String, AvroBicycleCount> deduplicationStore;
    private final String storeName;

    public CountUpdateDeduplicater(final String storeName) {
        this.storeName = storeName;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void init(final ProcessorContext context) {
        this.deduplicationStore = (KeyValueStore<String, AvroBicycleCount>) context.getStateStore(storeName);
    }


    @Override
    public AvroBicycleCount transform(final String counterId, final AvroBicycleCount count) {
        LocalDateTime countDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(count.getCountTimestamp()), ZoneId.of("Europe/Paris"));
        String key = counterId+"_"+countDateTime.getHour();

        AvroBicycleCount previousCountForSameHour = deduplicationStore.get(key);
        if(previousCountForSameHour != null && previousCountForSameHour.equals(count))
            return null;

        deduplicationStore.put(key, count);
        return count;
    }

    @Override
    public void close() {
        // Note: The store should NOT be closed manually here via `eventIdStore.close()`!
        // The Kafka Streams API will automatically close stores when necessary.
    }

}