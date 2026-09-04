package Phase1.DAY2;

class Student {

    private Student() {
        System.out.println("Private constructor");
    }

    public static void createObject() {
        Student obj = new Student();
    }
}

public class PrivateConstructor {

    public static void main(String[] args) {
        Student.createObject();
    }
}