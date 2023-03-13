package com.hari;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class OrderService {

   @Inject
   public OrderKafkaProducer kafkaProducer;

   public String sendOrder(Order order) {
      System.out.println("OrderService  " + order);
      String message = "Order created successfully";
      String status = "Success";
      OrderEvent eventData = new OrderEvent(message, status, order);
      kafkaProducer.produceOrderEvent(eventData);
      return "Order stored successfully";
   }

}
