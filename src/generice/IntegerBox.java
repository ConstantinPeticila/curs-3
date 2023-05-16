package generice;

public class IntegerBox {

    Integer camp;

    public IntegerBox(Integer camp) {
        this.camp = camp;
    }

    public void print(){
        System.out.println("Continut box: " + camp);
    }

    @Override
    public String toString() {
        return "IntegerBox{" +
                "camp=" + camp +
                '}';
    }

    public <T, U> T afisareDinIntegerBox(T param1, U param2){
        System.out.println(param1);
        System.out.println(param2);
        return param1;
    }
}
