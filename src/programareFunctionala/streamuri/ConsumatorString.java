package programareFunctionala.streamuri;

import java.util.function.Consumer;

public class ConsumatorString<T> implements Consumer<T> {
    @Override
    public void accept(T t) {
        System.out.println("afisare: " +t);
    }
}
