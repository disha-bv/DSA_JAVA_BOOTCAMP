package Phase1.DAY2;

class Laptop{
    String brand;
    int ramSize;

    public Laptop(String brand , int ramSize){  //original constructor
        this.brand = brand;     // local variable
        this.ramSize = ramSize; // instance variable
    }
    public Laptop(Laptop obj){  //copy constructor
        this.brand = obj.brand;
        this.ramSize = obj.ramSize;
    }
}

public class CopyConstructor {
    public static void main(String[] args){
        Laptop original = new Laptop("Dell" , 16);
        Laptop copy = new Laptop(original);
        System.out.println(copy.brand + " " + copy.ramSize);
    }

    
}
