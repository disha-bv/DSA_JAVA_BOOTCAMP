package DAY3.Session1;

class Animal{

    void makeSound(){
        System.out.println("Animal MAkes Sound:");
    }
}
class Dog extends Animal {
    @Override
    void makeSound(){
    System.out.println("barks");
    }
}
class Cat extends Animal {
    @Override
    void makeSound(){
    System.out.println("meow");
    }
}
class Cow extends Animal {
    @Override
    void makeSound(){
    System.out.println("ambaaa");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args){
        


    }
    
}
