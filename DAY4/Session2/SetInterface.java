package DAY4.Session2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class SetInterface {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        System.out.println("Enter the number of elements");
        Scanner sc = new Scanner(System.in);
        for(int i =0 ; i<6 ; i++){
            set.add(sc.nextInt());

        }
        System.out.println("the values are");
        System.out.println(set);
        set.remove(2);
        
    }
    
}
