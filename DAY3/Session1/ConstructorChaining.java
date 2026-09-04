package DAY3.Session1;
class student{
    String name ;
    int age ;
    String course;
 // same class
    public student(String name , int age , String course){
        this.name = name;
        this.age = age ;
        this.course = course;

    }

    public student() {
        this("Disha",21,"DAS");
    }
    void view(){
        System.out.println(name+ " " +age+ " " +course);
    }
}
//different class
class child extends student{
    public child(){
        super("Hrithvi",20,"AIML");
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        student s = new student();
        s.view();
    }
}   
