package programareFunctionala.streamuri;

public class User {

    private final String name;

    public String getName() {
        return name;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
