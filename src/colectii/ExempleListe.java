package colectii;

import java.sql.Statement;
import java.util.*;

public class ExempleListe {

    public static void main(String[] args) {
//        exempleInitializareListe();
        List<String> list1 = new ArrayList<>();
        list1.add("elem1");
        list1.add("elem2");
        list1.add("elem3");
        list1.add(1, "ement4");
//        parcurgereLista(list1);
//        iterare(list1);

        for(String el: list1){
            System.out.println(el);
        }

        List<String> nume = List.of("Andrei", "Mihai");
        System.out.println(nume);
       /* nume.add("Giga");
        System.out.println(nume);*/
    }

    private static void iterare(List<String> list1) {
        ListIterator<String> iterator = list1.listIterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if(next.equalsIgnoreCase("elem2")){
                iterator.remove();
                continue;
            }
                System.out.println(next);
//            System.gc();
        }
        for(String s: list1){
            System.out.println(s);
        }
    }

    private static void parcurgereLista(List<String> list1) {
        for(int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
            if(i==1){
                list1.remove(i);
                i--;
            }
        }
        System.out.println("-------");
        for(String element: list1){
            System.out.println(element);
        }
    }

    private static void exempleInitializareListe() {
        List<String > list2 = new LinkedList<>();
        List<Integer> stackList = new Stack<>();
        // functionalitati specifice stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
