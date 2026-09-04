package Phase1.DAY1.Session3;

public class Difference {
    public static void main(String[] args){
        int num = 123 ;
        String str = String.valueOf(num);
        int len = str.length();
        for(int i=1 ; i<len ; i++){
            int last = Integer.parseInt(str.substring(i)); 
            int first = Integer.parseInt(str.substring(0, i));
            int diff = last - first;
            System.out.println("Difference :" +diff);
        }
    }
} 

