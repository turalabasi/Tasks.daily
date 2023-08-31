package Task5;

public class NotificationFactory {
    public static Notification createNotification(String mark) {
        Notification notification;

        if(mark.equalsIgnoreCase("email")){
            notification = new EmailNotification();
        } else if (mark.equalsIgnoreCase("sms")) {
            notification = new SmsNotification();
        }
        else{
            throw new RuntimeException("another type of notification");
        }
        return notification;
    }
}
