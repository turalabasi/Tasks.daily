package Task5;

public class Main {
    public static void main(String[] args) {
       Notification emailNotification=NotificationFactory.createNotification("email");
       emailNotification.SendNotification();
        System.out.println("");
       Notification smsNotification=NotificationFactory.createNotification("sms");
         smsNotification.SendNotification();


    }
}
