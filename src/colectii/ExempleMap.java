package colectii;

import java.util.HashMap;
import java.util.Map;

public class ExempleMap {

    public static void main(String[] args) {
        exempluSimplu();
        Map<Student,Integer> studentToNota = new HashMap<>();
        Student alex = new Student("Alex", 8);
        Student costi = new Student("Costi", 7);
        studentToNota.put(alex, 9);
        studentToNota.put(costi, 7);
        System.out.println(studentToNota.get(alex));
//        alex.setNota(5);
//        System.out.println(studentToNota.get(alex));

        for(Map.Entry<Student,Integer> entry: studentToNota.entrySet()){
            System.out.println("Studentul: " + entry.getKey().getNume() + " are nota: " + entry.getValue());
        }
    }

    private static void exempluSimplu() {
        Map<String, Integer> map = new HashMap<>();
        map.put("ana", 3);
        map.put("are", 3);
        map.put("ana", 4);
        map.put(null, null);
    }
}
