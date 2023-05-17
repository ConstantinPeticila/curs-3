package programareFunctionala;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        //OOP
        Logger oopLogger = new LoggerImpl();
        oopLogger.log("input");
        //OOP direct
        Logger oop2Logger = new Logger() {
            @Override
            public void log(String input) {
                System.out.println("logare cu OOP direct: " + input);
            }
        };
        oop2Logger.log("input");

        //Programare functionala
        Logger fpLogger = input -> System.out.println("logare cu programare functionala: " + input);
        fpLogger.log("input");

        Logger simpleLogger = System.out::println;
        simpleLogger.log("input");

        Supplier<Double> doubleSupplier = () ->
            Math.random()*100;
        System.out.println(doubleSupplier.get());

        Consumer<String> logger = (input) -> System.out.println("afisare input:" + input);
        logger.accept("input");

        Predicate<Integer> testareParitate = (Integer input) ->{
            if(input%2 == 0){
                return true;
            }
            return false;
        };
        System.out.println(testareParitate.test(2));

        Function<String,Integer> nrchar = (String input) -> {
            return input.length();
        };
        System.out.println(nrchar.apply("input"));
    }
}
