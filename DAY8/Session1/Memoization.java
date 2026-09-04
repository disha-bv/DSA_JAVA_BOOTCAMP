package DAY8.Session1;
import java.util.Arrays;
import java.util.Scanner;

public class Memoization {
    public static int climb(int n,int[] dp){
        if(n==0 || n==1){
            return 1;

        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n]=climb(n-1,dp)+climb(n-2,dp);
        return dp[n];
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[] dp = new int[n+1];
        Arrays.fill(dp,0);

    }
    
}
