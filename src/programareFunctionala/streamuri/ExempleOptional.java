package programareFunctionala.streamuri;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class ExempleOptional {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Andrei", "Ioana", "Ana");

        Optional<String> any = names.stream()
                .filter(x -> x.contains("dr"))
                .findAny();

//        System.out.println(any.get());
        Consumer<String> stringConsumer = x -> System.out.println(x);
        any.ifPresent(new ConsumatorString<>());

        String rezultat = any.orElse("ANDREI");
        System.out.println();

        List<User> users = Arrays.asList(new User("Andrei"), new User("Mircea"));
        Optional<User> user = users.stream()
                .filter(x -> x.getName().contains("dr"))
                .findFirst()
                .filter(x -> x.getName().length() > 8);
        User andrei = user.orElse(new User("ANDREI"));
        System.out.println(andrei.getName());
    }
}
