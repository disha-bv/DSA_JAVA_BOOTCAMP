package DAY5;

public class CheckedExceptionUsingThrow {
        static void Age(int age) throws Exception{
            if(age>21){
                throw new Excepion("Age must be 21");
            }
            System.out.println("Eligible");

        } 
        public static void main(String[] args) {
            try {
                Age(21);
            } catch (Exception e) {
                System.out.println()
            }
        }
    }
    

