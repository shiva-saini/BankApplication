import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user details");
        String name = sc.nextLine();
        String password = sc.next();
        int balance = sc.nextInt();
        HDFCAccount shiva = new HDFCAccount(name,balance,password);
        System.out.println("Account has been created with " + "Name - " + shiva.getName() + " AccountNo - " + shiva.getAccountNo());
        System.out.println("enter how much money you want to deposit ");
        int amount = sc.nextInt();
        System.out.println(shiva.depositMoney(amount));
        System.out.println("Enter how much money u want ot withdraw");
        amount = sc.nextInt();
        System.out.println(shiva.withdraw(amount,"shiva123"));

        System.out.println(shiva.calculateInterest(5));
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter user details");
//        String name = sc.nextLine();
//        String password = sc.next();
//        int balance = sc.nextInt();
//        SBIAccount shiva = new SBIAccount(name,balance,password);
//        System.out.println("Account has been created with " + "Name - " + shiva.getName() + " AccountNo - " + shiva.getAccountNo());
//        System.out.println("enter how much money you want to deposit ");
//        int amount = sc.nextInt();
//        System.out.println(shiva.depositMoney(amount));
//        System.out.println("Enter how much money u want ot withdraw");
//        amount = sc.nextInt();
//        System.out.println(shiva.withdraw(amount,"shiva123"));
//
//        System.out.println(shiva.calculateInterest(5));





    }
}