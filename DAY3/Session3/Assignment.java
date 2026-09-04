package DAY3.Session3;
class currentBill{
    double watts ;
    double hours;

    void Amount(){

    }
}
class fan extends currentBill{
    void watts(){
        System.out.println("fan value");
    }
    void hours1(){
        System.out.println("time taken");
    }
}
class light extends currentBill{
    void watts(){
        System.out.println("light value");
    }
    void hours2(){
        System.out.println("time taken");
    }
    
}
class TV extends currentBill{
    void watts(){
        System.out.println("tv value");
    }
    void hours2(){
        System.out.println("time taken");
    }

    void bill(){
        double kwh = (watts*hours)/1000;
        double amount = kwh * 1.5 ;
        }
    }


public class Assignment {
    public static void main(String[] args) {
        

    }
    
}
