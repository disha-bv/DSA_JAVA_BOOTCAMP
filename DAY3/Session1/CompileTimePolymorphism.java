package DAY3.Session1;

class Calculator{
    int add(int a , int b) {
        return a+b;
    }
    double add(double a , double b){ // method overloading(function with same name but different return values)
    return a+b;
    }
}
public class CompileTimePolymorphism {
    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println(c.add(10,10));
        System.out.println(c.add(10.5f,10.5f)); 


    }

    
}
