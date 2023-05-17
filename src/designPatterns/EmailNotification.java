package designPatterns;

public class EmailNotification implements Notification{
    @Override
    public void notificareUser() {
        System.out.println("se notifica prin email");
    }
}
