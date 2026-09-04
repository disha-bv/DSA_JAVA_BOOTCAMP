package DAY6.Session1;

public class UncheckedException{
    public static void main(String[] args) {
    int[] numbers = {10,20,30};
    try{
        System.out.println(numbers[6]);
    }catch(ArrayIndexOutOfBoundsException a){
        System.out.println("index not found");
    }  
    
    }
    
}
