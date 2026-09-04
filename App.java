public class App{
    public static void main(String[] args){
        System.out.println("Hello, World!");
        int N = 454; 
        int c100 = N / 100;
        System.out.println("Number of $100 :" + c100);
        int c50= (N%100) /50 ;
        System.out.println("Number of $50 :" + c50);
        int c20= (N%50) / 20 ;
        System.out.println("Number of $20 :" + c20);
        int c10= (N%20) / 10 ;
        
    }
}