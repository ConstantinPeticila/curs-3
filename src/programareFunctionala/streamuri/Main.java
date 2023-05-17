package programareFunctionala.streamuri;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = List.of(2,3,5,4,6);
//        List<Integer> integers = Arrays.asList(1, 2, 3, 45);
//        System.out.println(integers);

        Stream<Integer> stream = list.stream();
        Consumer<Integer> integerConsumer = (input) -> System.out.println("Numar: " + input);

        list.stream().forEach(integerConsumer);

        //stream infinit
        Stream<Integer> pare = Stream.iterate(0, (input) -> input+2);

        long count = list.stream().count();
        System.out.println(count);

        boolean toatePare = list.stream().allMatch((Integer x) -> {
            return x % 2 == 0;
        });
        boolean celPutinUnPar = list.stream().allMatch(x -> x % 2 == 0);
        System.out.println("Sunt toate elementele pare: " + toatePare);

        Optional<Integer> min = list.stream().min((x, y) -> x - y);
        System.out.println(min.get());

        List<String> names = Arrays.asList("Ana", "Andrei", "Ioana", "Ana");
        Optional<String> reduce = names.stream().reduce((input1, input2) -> {
            return input1 + " , " + input2;
        });
        System.out.println(reduce.get());

        List<String> stringList = names.stream()
                .collect(Collectors.toList());
        System.out.println(stringList);
        Set<String> setNames = names.stream().collect(Collectors.toSet());
        System.out.println(setNames);
        System.out.println(names.stream().collect(Collectors.toCollection(() -> new TreeSet<>())));

        System.out.println(setNames.stream().collect(Collectors.toMap(e->e.toUpperCase(), e -> e.length())));

        Map<Integer, List<String>> byLength = names.stream().collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(byLength);
        Map<Integer, Long> longMap = names.stream().collect(Collectors.groupingBy(x -> x.length(), Collectors.counting()));
        System.out.println(longMap);

    }
}
