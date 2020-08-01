package velibstreaming.kafka.stream.builder;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.kstream.Joined;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;
import velibstreaming.avro.record.source.AvroBicycleCount;
import velibstreaming.avro.record.stream.AvroStationsAffectedByCount;
import velibstreaming.avro.record.stream.AvroZone;
import velibstreaming.kafka.stream.StreamUtils;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StationNearbyCountsStreamBuilder {

    public KStream<String, AvroBicycleCount> build(KStream<String, AvroBicycleCount> countUpdatesProjectedStream, KTable<String, AvroZone> zoneTable) {
        return countUpdatesProjectedStream
                .join(
                        zoneTable,
                        (count, zone) -> new AvroStationsAffectedByCount(new ArrayList<>(zone.getStationsCoordinates().keySet()), count),
                        Joined.with(Serdes.String(), StreamUtils.AvroSerde(), StreamUtils.AvroSerde())
                )
                .flatMap(
                        (zoneId, stationsAffected) -> stationsAffected.getStationCodes().stream()
                                .map(stationCode -> new KeyValue<>(stationCode, stationsAffected.getCount()))
                                .collect(Collectors.toList())
                );
    }
}