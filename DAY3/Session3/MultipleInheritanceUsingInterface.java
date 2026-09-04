package DAY3.Session3;
interface A{
    void skill2();
}
interface B{
    void skill1();
}
interface Child extends A,B{
    void skill3();
}
class Details implements Child{
    @Override
    public void skill2(){

    }
    @Override
    public void skill1(){

    }
    @Override
    public void skill3(){

    }
}

public class MultipleInheritanceUsingInterface {
    public static void main(String[] args){
        Child obj = new Details();
        obj.skill1();
        obj.skill2();

    }
}
