package DAY3.Session2;

class Bank{     // static variable
    static int count = 0;
    static String appName ;

    static {    // Static block
        appName = "bank of baroda";
    }

    static void printcount() {  // static method
        System.out.println("Static method");
    }
}

public class StaticVariable {

    public static void main(String[] args){
        StaticVariable s = new StaticVariable();
        

    }    
}
