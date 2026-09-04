package DAY9.Session1;

public class StringBuilder1 {
    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder("Disha");
        System.out.println("Before change: " +s1);
        s1.append(" Shetty");
        s1.insert(5, " is ");
        s1.delete(6,8 );
        s1.replace(0, 5, "deepu");
        s1.reverse();

        System.out.println("After: "+s1);
    }
    
}

