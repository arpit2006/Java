package LAB_FAT;
interface bankAccount
{
    public void deposit(int amount);
    public void withdraw(int amount);
    public void getBalance();
}

class SavingsAccount implements bankAccount {
    double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited amount..: " + amount);
        System.out.println("Total amount in account..: " + balance);
        System.out.println();
    }
    @Override
    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient Funds..! ");
        } else {
            System.out.println("Withdrawl Sucessfull of amount..: " + amount);
            System.out.println("Total amount in account..: " + (balance - amount));
            System.out.println();
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Balance is..: " + balance);
        System.out.println();
    }
}
    class CurrentAccount implements bankAccount {
        double balance;

        public CurrentAccount(double balance) {
            this.balance = balance;
        }

        @Override
        public void deposit(int amount) {
            balance = balance + amount;
            System.out.println("Deposited amount..: " + amount);
            System.out.println("Total amount in account..: " + balance);
            System.out.println();
        }

        @Override
        public void withdraw(int amount) {
            int draftLimit = 10000;
            if (amount > draftLimit) {
                System.out.println("Draft Limit is ₹10000..! ");
                System.out.println("Please try again later..! ");
            } else {
                System.out.println("Withdrawl Sucessfull of amount..: " + amount);
                System.out.println("Total amount in account..: " + (balance - amount));
                System.out.println();
            }
        }

        @Override
        public void getBalance() {
            System.out.println("Balance is..: " + balance);
            System.out.println();
        }
    }
    public class Ex_12 {
        public static void main(String[] args) {
//        2. Banking System with Interfaces
//        Description:
//        Design a BankAccount interface with methods deposit(), withdraw(), and getBalance().
//        Implement it in SavingsAccount and CurrentAccount classes with different withdrawal rules.
//        Concepts Covered: Interface, Method Overriding, Abstraction
            SavingsAccount sa = new SavingsAccount(13000.0);
            sa.deposit(1000);
            sa.withdraw(1000);

            CurrentAccount cc = new CurrentAccount(100000);
            cc.deposit(1000);
            cc.withdraw(1000000);
        }
    }

