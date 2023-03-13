package com.hari;

public class Product {
   private String productName;
   private Integer productQuantity;
   private Integer productPrice;

   public String getProductName() {
      return productName;
   }

   public void setProductName(String productName) {
      this.productName = productName;
   }

   public Integer getProductQuantity() {
      return productQuantity;
   }

   public void setProductQuantity(Integer productQuantity) {
      this.productQuantity = productQuantity;
   }

   public Integer getProductPrice() {
      return productPrice;
   }

   public void setProductPrice(Integer productPrice) {
      this.productPrice = productPrice;
   }

   public Product() {
   }

   public Product(String productName, Integer productQuantity, Integer productPrice) {
      this.productName = productName;
      this.productQuantity = productQuantity;
      this.productPrice = productPrice;
   }

   @Override
   public String toString() {
      return "Product [productName=" + productName + ", productQuantity=" + productQuantity + ", productPrice="
            + productPrice + "]";
   }

}
