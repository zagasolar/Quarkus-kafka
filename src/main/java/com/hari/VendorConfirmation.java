package com.hari;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Access(AccessType.PROPERTY)
@Table(name = "Vendor_data")
public class VendorConfirmation extends PanacheEntityBase {

   // @Id
   // @GeneratedValue
   // @Column(name = "vendorId")
   private Long id;
   private String vendorName;
   private Order order;
   private Boolean orderConfirmed;

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getVendorName() {
      return vendorName;
   }

   public void setVendorName(String vendorName) {
      this.vendorName = vendorName;
   }

   @ManyToOne
   @JoinColumn(name = "order_id")
   public Order getOrder() {
      return order;
   }

   public void setOrder(Order order) {
      this.order = order;
   }

   public Boolean getOrderConfirmed() {
      return orderConfirmed;
   }

   public void setOrderConfirmed(Boolean orderConfirmed) {
      this.orderConfirmed = orderConfirmed;
   }

   public VendorConfirmation() {

   }

   public VendorConfirmation(Long id, String vendorName, Order order, Boolean orderConfirmed) {
      this.id = id;
      this.vendorName = vendorName;
      this.order = order;
      this.orderConfirmed = orderConfirmed;
   }

   @Override
   public String toString() {
      return "VendorConfirmation [id=" + id + ", vendorName=" + vendorName + ", order=" + order + ", orderConfirmed="
            + orderConfirmed + "]";
   }

}
