package Phase1.DAY2;

public class Function {
    public static void main(String[] args){
        Function obj = new Function();
        int result = obj.add(10,20);
        System.out.println("Addition:" +result);
    }

    public int add(int a, int b){
        return a + b;
    }
}
