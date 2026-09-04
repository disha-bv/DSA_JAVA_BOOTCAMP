package DAY10.SESSION3;

public class ArmStrong {
    public static void main(String[] args){
        int num = 143;
        int originalNum = num;
        int sum= 0;
        int temp = num;
        while(temp!=0){
            int digit = temp%10;
            sum += digit*digit*digit;
            temp/=10;
        }
        if(sum==originalNum)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }

}
