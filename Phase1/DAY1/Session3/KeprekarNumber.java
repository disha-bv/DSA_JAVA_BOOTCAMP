package Phase1.DAY1.Session3;

public class KeprekarNumber {
    public static void main(String[] args){
        int n = 25;
        int square = n*n;
        String str = String.valueOf(square); //boxing
        int len = str.length();
        for(int i=1 ; i<len ; i++){
            String left = str.substring(0 ,i);
            String right = str.substring(i);
            int leftNum = Integer.parseInt(left);
            int rightNum = Integer.parseInt(right);
            if(leftNum + rightNum == n ){
                System.out.println("Keprekar Number");
                found = true;
            }
            if(found){
                System.out.println("kn");
            
            }else{
                System.out.println("not kn");
            }
        }
    

    }

    
}
    

