package DAY3.Session2;

interface Animal{
    default void eat(){
        System.out.println();
    }
    void sleep();


}
class Monkey implements Animal{
    public void eat(){
        System.out.println("Monkey eats banana");

    }
    public void sleep(){
        System.out.println("Monkey sleeps on tree");

    }
}

public class InterfaceExample {

    public static void main(String[] args) {
        
    }
    
}
