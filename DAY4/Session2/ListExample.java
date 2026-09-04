package DAY4.Session2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String>list = new LinkedList<>();
        List<String> value = new Vector<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.pop();
        stack.peek();

        
        
        names.add("Disha");
        names.add("Deepu");
        names.add("rama");
        names.add("shama");
        names.add("soma");
        names.add("bhama");
        names.add("fathima");


        System.out.println(names);
        System.out.println(names.get(1));
        System.out.println(names);

        names.set(5,"shalini");
        System.out.println(names);

        names.remove(4);
        System.out.println(names);

        names.add("Dileep");
        System.out.println(names);

        names.get(4);
        System.out.println(names);

        for(String name : names){  // printing values using loop
            System.out.println(name);
        }

    }
    
}
