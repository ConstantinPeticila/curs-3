package programareFunctionala.streamuri;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExempleOpIntermediare {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Andrei", "Ioana", "Ana");

        Predicate<String> checkA = (String input) -> {
            if (input.startsWith("A")) {
                return true;
            }
            return false;
        };
        List<String> rezultate = names.stream()
                .filter(checkA)
                .collect(Collectors.toList());
        System.out.println(rezultate);

//        Arrays.asList()
        Stream.iterate(0, e -> e+3)
                .limit(10)
                .forEach(x -> System.out.println(x));
        long count = Stream.iterate(0, e -> e + 3)
                .takeWhile(x -> {
                            return x < 1000;
                        }
                )
                .count();
        System.out.println(count);

        System.out.println(names.stream().distinct().collect(Collectors.toList()));
        System.out.println(names.stream().sorted((x,y) -> x.length() - y.length()).collect(Collectors.toList()));

        names.stream()
                .filter(x -> x.length()>4)
                .map(x ->x.toUpperCase())
                .filter(x -> x.contains("O"))
                .forEach(x -> System.out.println("Nume cu litere mari: " + x));
    }
}
