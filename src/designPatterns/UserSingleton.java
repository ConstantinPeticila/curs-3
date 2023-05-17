package designPatterns;

public class UserSingleton {

    private String name;
    private Integer age;

    private UserSingleton(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private static UserSingleton singleton = null;

    public static UserSingleton getUser(String name, Integer age){
        if(singleton == null){
             singleton = new UserSingleton(name, age);
        }
        return singleton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserSingleton{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
