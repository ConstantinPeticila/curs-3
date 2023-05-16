package generice;

public class Main {

    public static <T, U> T afisareDinMain(T param1, U param2){
        System.out.println(param1);
        System.out.println(param2);
        return param1;
    }

    public static <T extends Number> void metodaPentruNumere(T param){
        System.out.println("afisare din metoda pentru numere: " + param);
    }

    public static void metodaCuParamGeneric(Box<?> box){
        System.out.println(box);
    }

    public static void metodaCuParamParinte(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        IntegerBox box = new IntegerBox(1);
        StringBox box1 = new StringBox("String");

        box.print();
        box.afisareDinIntegerBox("param1", 20);
        afisareDinMain("param1", 20);
        metodaPentruNumere(1);
        metodaPentruNumere(1.1);
//        metodaPentruNumere("string");

        box1.print();

        Box<Integer> integerBox = new Box<>(1);
        Box<String> stringBox = new Box<>("String");
        integerBox.print();
        stringBox.print();
        Box<IntegerBox> integerBoxBox = new Box<>(new IntegerBox(1));
        integerBoxBox.print();

//        metodaCuParamGeneric(stringBox);
        metodaCuParamGeneric(integerBox);
        metodaCuParamParinte(1);
    }
}
