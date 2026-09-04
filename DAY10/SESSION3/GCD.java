package DAY10.SESSION3;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number:");
        int a = sc.nextInt();
        System.out.println("enter the 2nd number:");
        int b = sc.nextInt();
        System.out.println("GCD: " + findGCD(a, b));
        sc.close();
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}
