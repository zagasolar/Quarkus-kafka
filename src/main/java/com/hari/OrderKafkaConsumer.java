package com.hari;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class OrderKafkaConsumer {

   @Inject
   public VendorService service;

   @Incoming("orders-in")
   @Transactional
   public void consumeOrderData(OrderEvent event) {
      System.out.println("Consuming order data " + event);
      String vendorName = "Zaga";
      VendorConfirmation vendorData = new VendorConfirmation();
      vendorData.setOrder(event.getOrder());
      vendorData.setVendorName(vendorName);
      vendorData.setOrderConfirmed(true);
      service.vendorConfirmation(vendorData);
      System.out.println("Order confirmed by " + vendorData.getVendorName() + "successfully");
   }

}

// @Incoming("orders-in")
// public void consumeOrderData(String event) {
// System.out.println("Consuming order data " + event);
// }