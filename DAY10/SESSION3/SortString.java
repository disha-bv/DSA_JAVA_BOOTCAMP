package DAY10.SESSION3;
import java.util.Scanner;
public class SortString {
    public static String sortCharacters(String str){
        char[] chars = str.toCharArray();
        java.util.Arrays.sort(chars);
        return new String(chars);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        System.out.println("Sorted string: " + sortCharacters(input));
        sc.close();
    }
    
}
