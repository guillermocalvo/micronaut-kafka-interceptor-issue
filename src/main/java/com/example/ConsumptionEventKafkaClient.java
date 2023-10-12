package com.example;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.http.annotation.Header;
import org.apache.kafka.common.header.internals.RecordHeader;

import java.util.List;

@KafkaClient
public interface ConsumptionEventKafkaClient {
    @Topic("foobar")
    void sendEvents(@KafkaKey String key, String value, @Header List<RecordHeader> headers);
}
