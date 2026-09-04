package DAY3.Session2;
class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child {
    Parent p = new Parent();

    void show() {
        p.display();
        System.out.println("Child class");
    }
}

    

public class InheritanceWithoutExtend {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
