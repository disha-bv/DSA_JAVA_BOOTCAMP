package Phase1.DAY1.Session3;

public class Autounboxing {
    public static void main(String[] args){
        Integer obj = Integer.valueOf(40);
        int num = obj; //autounboxing
        System.out.println("Object :" +obj);
        System.out.println("Primitive :" +num);
    }
    
}
