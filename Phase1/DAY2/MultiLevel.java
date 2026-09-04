package Phase1.DAY2;
class Grandpa{
        String name;
        void skill1(){
            System.out.println("Making properties");
        }
    }
    class Appa extends Grandpa{
        String name ;
        void skill2(){
            System.out.println("Making money");
        }
    }
    class disha extends Appa{
        String name;
        void skill3(){
            System.out.println("Spending money");
        }
    }
public class MultiLevel{
    public static void main(String[] args){
        disha d = new disha();
        d.skill1();
        d.skill2();
        d.skill3();
        Appa a= new disha();
        a.skill1();
        a.skill2();
        Grandpa g = new disha();
        g.skill1();
        
    }

    
}
