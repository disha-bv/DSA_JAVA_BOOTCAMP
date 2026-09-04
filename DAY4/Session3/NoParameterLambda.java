package DAY4.Session3;
@FunctionalInterface
interface Greet{
    void sayHello();
}
public class NoParameterLambda {
    public static void main(String[] args){
        Greet g = () -> System.out.println("hello");
        g.sayHello();

    }
    
}
