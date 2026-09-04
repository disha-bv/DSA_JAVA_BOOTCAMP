package DAY3.Session2;

final class Wallet{
    final int capacity = 100;

    final void display(){
        System.out.println(capacity);
    }

}

public class FinalKeywordUsage {
    public static void main(String[] args){
        Wallet w = new Wallet();
        System.out.println(w.capacity);
    }
    
}
