package DAY7.Session2;

public class Decode {

    public static int decode(String s){
        if(s.isEmpty()||s.c charAt(0)=='0'){
            return 0;
        }
        int[] dp = new int[s.length() +1];
        dp[0] =1;
        dp[1] =1;
        for(int i=2 ; i<= n ;i++){
            int oneWay = s.charAt(i-1)-'0';
            if(oneWay>=1 && oneWay <=9){
                dp[i] = dp[i] +dp[i-1];
            }
            int doubleWay= Integer.parseInt(s.substring(i-2 , i));
            if(doubleWay >=10 && doubleWay <= 26){
                dp[i] = dp[i] +dp[i-2];
            }
        }

    }
    public static void main(String[] args){
        System.out.println();

    }
    
}
