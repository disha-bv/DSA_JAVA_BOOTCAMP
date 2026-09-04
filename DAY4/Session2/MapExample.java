package DAY4.Session2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer , String>students = new HashMap<>();
        students.put(42,"hrithvi");
        students.put(43,"hrithvi urs");
        System.out.println(students);
        System.out.println(students.get(42));

        for(Map.Entry<Integer, String>entry:students.entrySet()){
            System.out.println(entry.getKey()+ "->" +entry.getValue());
        }


        
    }
}
