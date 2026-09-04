package DAY3.Session3;

interface Student {
}

class Disha implements Student {
    void display() {
        System.out.println("Student class");
    }
}

public class MakerInterface {
    public static void main(String[] args) {
        Disha d = new Disha();
        d.display();
    }
}