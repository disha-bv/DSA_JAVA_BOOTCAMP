package DAY6.Session1;
class InvalidMarksException extends RuntimeException{
    public InvalidMarksException(String message){
        super(message);
    }
}
public class UncheckedCustomException {
    public static void MarksCheck(int marks){
        if(marks < 0 || marks>100){
            throw new InvalidMarksException("Marks invalid");

        }
        System.out.println("valid marks " +marks);
    }
    public static void main(String[] args){
        try{
            MarksCheck(150);
        } catch (InvalidMarksException e){
            System.out.println("exception:" +e.getMessage());
        }
        System.out.println("program continues...");

    }
    
}
