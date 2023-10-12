package com.example;

import io.micronaut.context.annotation.Context;
import jakarta.annotation.PostConstruct;

import java.util.Collections;

@Context
public class MyService {

    @PostConstruct
    public void postConstruct(ConsumptionEventKafkaClient client) {
        System.err.println("SENDING EVENTS");
        client.sendEvents("hello", "world", Collections.emptyList());
        client.sendEvents("lorem", "ipsum", Collections.emptyList());
        System.err.println("EVENTS SENT");
    }
}
