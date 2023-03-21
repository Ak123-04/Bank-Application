package bankApp;

public interface BankInterface {

    public int checkBalance(String password);
    public String deposit(int money);
    public String withdrawMoney(int money,String password);
    public String changePWD(String oldPWD,String newPWD);

    public Double rateOfInterest(int years);
}
