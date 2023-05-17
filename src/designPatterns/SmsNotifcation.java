package designPatterns;

public class SmsNotifcation implements Notification{
    @Override
    public void notificareUser() {
        System.out.println("Notificare prin SMS");
    }
}
