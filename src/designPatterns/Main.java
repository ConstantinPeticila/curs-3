package designPatterns;

public class Main {

    public static void main(String[] args) {

        UserSingleton user = UserSingleton.getUser("Andrei", 10);
        user.setName("Mihai");

        UserSingleton newUser = UserSingleton.getUser("Costi", 45);
        System.out.println(user);
        System.out.println(newUser);
        System.out.println(user == newUser);
    }
}
