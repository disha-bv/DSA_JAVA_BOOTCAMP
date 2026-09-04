package DAY3.Session3;
class Father{
    void skill(){
        System.out.println("Riding a bike");
    }

}
interface Mother{
    void skill2();
}
class child extends Father implements Mother{
    @Override
    void skill2(){
        System.out.println("Dancing");

    }
}
public class MultipleInheritance {

    
}


