package DAY12.SESSION1;
import java.util.Scanner;

public class AssignmentDay12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hyperlinks = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = sc.nextInt();

                if(value == 1){
                    hyperlinks++;
                }
                
            }
            
        }
        System.out.println("number of webpages:" +n);
        System.out.println("number of hyperlinks:" +hyperlinks);

        sc.close();
    }
    
}
