package DAY3.Session3;
interface Add {
    int sum(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {

        Add obj = (a, b) -> a + b;

        System.out.println(obj.sum(10, 20));
    }
}
