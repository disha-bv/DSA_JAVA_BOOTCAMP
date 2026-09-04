package DAY4.Session2;

import java.util.ArrayList;
import java.util.List;


public class StudentRoaster{
    public static void main(String[] args) {
        List<String> Roaster = new ArrayList<>();
        Roaster.add("a");
        Roaster.add("b");
        Roaster.add("c");
        Roaster.add(1,"d");
        System.out.println("After adding at index 1:" +Roaster);
        Roaster.remove("c");
        System.out.println("contains element:" +Roaster.contains("a"));
        System.out.println("index element:" +Roaster.indexOf("a"));

    }
}
