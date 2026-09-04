package DAY3.Session3;

import java.util.Scanner;

class Account{
    String name;
    int number;
    String date;
    double balance;

    Account(String Name , int Num , String Date , double Balance){
        name = Name;
        number = Num;
        date = Date;
        balance = Balance;

    }
}
interface MaintenanceCharge{
    float computeMaintenanceCharge(int n); // 
} 

class CurrentAccount extends Account implements MaintenanceCharge{
    CurrentAccount(String Name , int Num , String Date , double Balance){
            super( Name , Num , Date , Balance);
    }
    public float computeMaintenanceCharge(int n){
        return 100*n+200;
    }
}
class SavingsAccount extends Account implements MaintenanceCharge{
    SavingsAccount(String Name , int Num , String Date , double Balance){
        super( Name , Num , Date , Balance);
    }
    public float computeMaintenanceCharge(int n){
        return 2*50*n+50;
    }
}
public class Assignment2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Current Account");
        System.out.println("Saving Account");

        int ch = s.nextInt();
        String name =s.next();
        int number = s.nextInt();
        double balance = s.nextDouble();
        String date = s.next();
        int years = s.nextInt();

        MaintenanceCharge a;

        if(ch==1)
            a= new CurrentAccount(name, number , date, balance);
        else
            a = new SavingsAccount(name, number, date, balance);

        System.out.printf("maintenance charge: %.2f",a.computeMaintenanceCharge(years));

    }
    
}
