package generice;

public class Box<T> {
    T camp;

    public Box(T camp) {
        this.camp = camp;
    }

    public void print(){
        System.out.println("Continut box: " + camp);
    }

    @Override
    public String toString() {
        return "Box{" +
                "camp=" + camp +
                '}';
    }
}
