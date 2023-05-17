package designPatterns;

public class NotificationFactory {

   /* public static Notification createNotification(String tip){
        switch (tip){
            case "push":{
                return new PushNotification();
            }
            case "sms":{
                return new SmsNotifcation();
            }
            case "email":{
                return new EmailNotification();
            }
            default:{
                throw new RuntimeException("Notificarile pot fi doar: push, sms si email");
            }
        }
    }*/


    public static Notification createNotification(TIPNOTIFICARE tip){
        switch (tip){
            case PUSH:{
                return new PushNotification();
            }
            case SMS:{
                return new SmsNotifcation();
            }
            case EMAIL:{
                return new EmailNotification();
            }
            default:{
                throw new RuntimeException("Notificarile pot fi doar: push, sms si email");
            }
        }
    }
}
