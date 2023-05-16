package colectii;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExempleSet {

    public static void main(String[] args) {

//        exempluHashSet();

        Set<String> set = new TreeSet<>();
        set.add("Mihai");
        set.add("Andrei");
        set.add("Mihai");
//        set.add(null);

        for(String s: set){
            System.out.println(s);
        }
    }

    private static void exempluHashSet() {
        Set<String> set = new HashSet<>();
        set.add("Mihai");
        set.add("Andrei");
        set.add("Mihai");
        set.add(null);

        for(String s: set){
            System.out.println(s);
        }
    }
}
