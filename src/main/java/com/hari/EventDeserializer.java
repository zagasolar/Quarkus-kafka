package com.hari;

import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer;

public class EventDeserializer extends ObjectMapperDeserializer<OrderEvent> {

   public EventDeserializer() {
      super(OrderEvent.class);
   }

}
