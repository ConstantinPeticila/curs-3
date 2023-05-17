package designPatterns;

import static designPatterns.TIPNOTIFICARE.SMS;

public class FactoryMain {

    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification(SMS);
        notification.notificareUser();
    }
}
