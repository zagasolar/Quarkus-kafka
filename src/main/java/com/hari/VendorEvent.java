package com.hari;

public class VendorEvent {
   private String message;
   private String status;
   private VendorConfirmation vendorInfo;

   public String getMessage() {
      return message;
   }

   public void setMessage(String message) {
      this.message = message;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public VendorConfirmation getVendorInfo() {
      return vendorInfo;
   }

   public void setVendorInfo(VendorConfirmation vendorInfo) {
      this.vendorInfo = vendorInfo;
   }

   public VendorEvent() {

   }

   public VendorEvent(String message, String status, VendorConfirmation vendorInfo) {
      this.message = message;
      this.status = status;
      this.vendorInfo = vendorInfo;
   }

   @Override
   public String toString() {
      return "VendorEvent [message=" + message + ", status=" + status + ", vendorInfo=" + vendorInfo + "]";
   }

}
