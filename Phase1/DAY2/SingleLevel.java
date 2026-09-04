package Phase1.DAY2;
class Appa{
    String name;
    void skill(){
        System.out.println("Making money");    
    }
}
class disha extends Appa{
    String name;
    void skill(){
        System.out.println("Spending money");

    }
}
public class SingleLevel {
    public static void main(String[] args){
        disha c = new disha();
        c.skill();
        Appa a = new disha();
        a.skill();
        
    }

    
}
