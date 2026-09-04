package DAY3.Session1;
class Animal2{

    void makeSound(){
        System.out.println("Animal MAkes Sound:");
    }
}
class Dog2 extends Animal2 {
    @Override
    void makeSound(){
    System.out.println("barks");
    }
    void skill(){
        System.out.println("sleep");

    }
}
public class DownCastingPolymorphism {
    public static void main(String[] args){
        Animal2 a = new Dog2(); // Upcasting
        Dog2 d = (Dog2) a; // downcasting
        d.skill();
        d.makeSound();


    }
    
    
}
