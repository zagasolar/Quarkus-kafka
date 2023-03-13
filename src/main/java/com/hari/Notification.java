package com.hari;

public class Notification {
   private String message;
   private String notificationType;

   public String getMessage() {
      return message;
   }

   public void setMessage(String message) {
      this.message = message;
   }

   public String getNotificationType() {
      return notificationType;
   }

   public void setNotificationType(String notificationType) {
      this.notificationType = notificationType;
   }

   public Notification() {

   }

   public Notification(String message, String notificationType) {
      this.message = message;
      this.notificationType = notificationType;
   }

   @Override
   public String toString() {
      return "Notification [message=" + message + ", notificationType=" + notificationType + "]";
   }

}
