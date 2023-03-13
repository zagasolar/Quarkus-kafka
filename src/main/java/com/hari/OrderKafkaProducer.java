package com.hari;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import io.smallrye.reactive.messaging.kafka.Record;

@ApplicationScoped
public class OrderKafkaProducer {

   @Inject
   @Channel("orders-out")
   Emitter<Record<String, OrderEvent>> emitter;

   public Record<String, OrderEvent> produceOrderEvent(OrderEvent orderEvent) {

      System.out.println("produceOrderEvent called " + orderEvent);
      Record<String, OrderEvent> output = Record.of("Message", orderEvent);
      System.out.println("output called " + output);
      emitter.send(output);
      return output;
   }

   // @Inject
   // @Channel("orders-out")
   // Emitter<String> emitter;

   // public String produceOrderEvent(String orderEvent) {
   // System.out.println("produceOrderEvent called " + orderEvent);
   // emitter.send(orderEvent);
   // return orderEvent;
   // }

}
