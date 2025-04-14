package OOPS_Practice;
abstract class BankAccount{
protected String Account_Name;
protected double Account_Bal;

public BankAccount(String Account_Name,double Account_Bal) {
    this.Account_Name = Account_Name;
    this.Account_Bal = Account_Bal;
}

    public void deposit(double amount){
        Account_Bal = Account_Bal + amount;
        System.out.println("Deposited Sucessfully..: " + amount + " Current Balance..: " + Account_Bal);
    }

    public abstract void withdraw(double amount);
}
class SavingsAccount extends BankAccount{
    private double intrestRate;
    public SavingsAccount(double intrestRate,String Account_Name,double Account_Bal){
        super(Account_Name,Account_Bal);
        this.intrestRate = intrestRate;
    }

    @Override
    public void withdraw(double amount) {
        if(amount > Account_Bal){
            System.out.println("Insufficient Funds..! ");
            System.out.println("You have remaining funds are..: " + Account_Bal);
        }
        else {
            System.out.println("Withdrawled..: " + amount);
            System.out.println("Current Balance is...: " + (Account_Bal - amount));
        }
    }
}

class CurrentAccount extends BankAccount{
    protected double overDraftLimt;

    public CurrentAccount(String Account_Name,double Account_Bal,double overDraftLimt){
        super(Account_Name,Account_Bal);
        this.overDraftLimt = overDraftLimt;
    }

    @Override
    public void withdraw(double amount) {
        if((Account_Bal + overDraftLimt) >= amount){
            System.out.println(amount + " Withdrawled from current account..! ");
            System.out.println("Your current balance is..: " + (Account_Bal - amount));
        }
        else{
            System.out.println("Insufficeint funds..! ");
        }
    }
}

public class Ex_1 {
    public static void main(String[] args) {
        SavingsAccount sc = new SavingsAccount(2.0,"Arpit Shirbhate",100000);
        sc.deposit(10000);
        sc.withdraw(2000);

        CurrentAccount cc = new CurrentAccount("Aarya Shirbhate",1000,200);
        cc.deposit(10000);
        cc.withdraw(2000);
    }
}
