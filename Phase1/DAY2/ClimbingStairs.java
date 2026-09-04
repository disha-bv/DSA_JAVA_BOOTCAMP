package Phase1.DAY2;

import java.util.Scanner;

public class ClimbingStairs {
    public static int climb(int n){
        if (n==0 || n==1){
            return 1;

        }
        return climb(n-1)+climb(n-2);

    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of stairs");

        int n = in.nextInt();
        System.out.println("the combinations:" +climb(n));

    }
    
}
