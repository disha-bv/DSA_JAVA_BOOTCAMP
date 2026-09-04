package DAY6.Session1;
import java.util.Exception;
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }


}

public class CheckedCustomException {
    static void customerRegister(int age) throws InvalidAgeException {
        if(age<18){
            throw new InvalidAgeException("not eligible...");

        }

    }

    public static void main(String[] args) {
        try {
            customerRegister(21);
        } catch (InvalidAgeException e) {
            System.out.println("Exception" +e.getMessage());
        }
        System.out.println("Go to next page");

        
    }
    
}
