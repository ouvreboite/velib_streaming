package velibstreaming.producer.mapper;

import velibstreaming.avro.record.AvroBicycleCount;
import velibstreaming.producer.client.dto.BicycleCount;

public class BicycleCountMapper implements AvroMapper<BicycleCount.Fields, AvroBicycleCount> {
    @Override
    public AvroBicycleCount map(BicycleCount.Fields record) {
        return AvroBicycleCount.newBuilder()
                .setCounterId(record.getId_compteur())
                .setCount(record.getSum_counts())
                .setCountTimestamp(record.getDate().getTime())
                .build();
    }
}