package bankApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SBI.rateOfInterest=7;
        ICICI.rateOfInterest=9;
//        SBI account1=new SBI("Amit","1234",50000);
//        SBI account2=new SBI("Amit","1234",50000);
//
//        String balance =account1.withdrawMoney(1000,"1234");
//        System.out.println(balance);
//
//        double interest=account1.rateOfInterest(10);
//        System.out.println(SBI.customersNo);
//
//        System.out.println(account1.deposit(1000));
//
        //opening new account;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.nextLine();

        System.out.println("Enter password here");
        String password= sc.next();

        System.out.println("Enter amount here");
        int amount= sc.nextInt();

        SBI newAccount =new SBI(name,password,amount);

        System.out.println("To check balance enter password here");
        int balance=newAccount.checkBalance(sc.next());
        System.out.println(balance);

    }
}