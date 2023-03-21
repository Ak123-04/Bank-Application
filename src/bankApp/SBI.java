package bankApp;

import java.util.UUID;

public class SBI implements BankInterface{

    public String name;
    private String password;
    private int balance;
    private String accountNo;

    public static int rateOfInterest;
    public static int customersNo;

    public SBI(String name,String password,int balance){
        customersNo++;
        this.accountNo= UUID.randomUUID().toString();
        this.password=password;
        this.name=name;
        this.balance=balance;
    }

    @Override
    public int checkBalance(String password) {
        if(this.password.equals(password)){
            return balance;
        }
        return -1;
    }

    @Override
    public String deposit(int money) {
        balance=balance+money;
        String message="money has been deposited to account No"+accountNo+" Total balance is= "+balance;
        return message;
    }

    @Override
    public String withdrawMoney(int money, String password) {
        if(password.equals(this.password)){
            if(money>balance){
                return"Insufficient balance";
            }
            else{
                this.balance=balance-money;
                return"Transaction is successful Remaining balance is :"+balance;
            }
        }else{
            return "Wrong Password";
        }
    }

    @Override
    public String changePWD(String oldPWD, String newPWD) {
        if(this.password.equals(oldPWD)){
            this.password=newPWD;
            return"Password changed Successful";
        }
        else{
            return "Enter correct old Password";
        }
    }
    @Override
    public Double rateOfInterest(int years) {
        double interest=balance*rateOfInterest*years/100;
        return interest;
    }
}
