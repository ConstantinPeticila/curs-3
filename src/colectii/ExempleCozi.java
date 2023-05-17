package colectii;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ExempleCozi {

    public static void main(String[] args) {
//        exempleBasic();
        ComparatorDupaNota comparatorDupaNota = new ComparatorDupaNota();
//        Queue<Student> studenti = new PriorityQueue<>(comparatorDupaNota);

        Comparator<Student> comparator =
                (x,y) -> {
            //cate instructiuni ne dorim
            return y.getNota()-x.getNota();
        };
        Queue<Student> studenti = new PriorityQueue<>((x, y) -> y.getNota()-x.getNota());
        studenti.offer(new Student("Andrei", 9));
        studenti.offer(new Student("Mihai", 10));
        System.out.println(studenti.poll());
        System.out.println(studenti.poll());

        ArrayDeque<Integer> numere = new ArrayDeque<>();
        numere.offerFirst(1);
        numere.offerLast(3);
        System.out.println(numere.pollLast());
    }

    private static void exempleBasic() {
        Queue<String> coada = new PriorityQueue<>();
        coada.offer("Ana");
        coada.offer("nu");
        coada.offer("are");
        coada.offer("mere");
        System.out.println(coada.poll());
        System.out.println(coada.poll());

        Queue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.offer(5);
        integerQueue.offer(3);
        System.out.println(integerQueue.poll());
    }
}
