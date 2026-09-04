package DAY4.Session3;
@FunctionalInterface
interface Greet{
    void sayHello2(String name);
}
public class SingleParameterLambda {
    public static void main(String[] args){
        Greet g = (name) -> System.out.println("the name is" +name);
        g.sayHello2("Disha");

    }
    
}

    

