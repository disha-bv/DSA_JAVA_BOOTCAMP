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
    void Skill(){
        System.out.println("the dog sleeps");
    }
}

public class UpcastingPolymorphism {
    public static void main(String[] args){
        Animal a = new Dog();
        a.makeSound();
        a.Skill();
    }
    
}
