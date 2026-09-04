package DAY3.Session3;
@FunctionalInterface
interface Calculator {
    int multiply(int a, int b);
}
public class FunctionalInterfaceUsingLambda {
    public static void main(String[] args) {

        Calculator obj = (a, b) -> a * b;

        System.out.println(obj.multiply(5, 4));
    }
}
