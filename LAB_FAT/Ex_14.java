package LAB_FAT;
interface Payments{
    public void makePayement(int amount);
}

class CreditCard implements Payments{
    double creditLimit = 10000;

    @Override
    public void makePayement(int amount) {
        if(amount >= creditLimit){
            System.out.println("You are not Eligible..! ");
            System.out.println();
        }
        else{
            System.out.println("Payment Sucessful..! ");
            System.out.println("Limit Remaining..: " + (creditLimit - amount));
            System.out.println();
        }
    }
}

class UPI implements Payments{
    double UPILimit = 10000;

    @Override
    public void makePayement(int amount) {
        if(amount >= UPILimit){
            System.out.println("You are not Eligible..! ");
            System.out.println();
        }
        else{
            System.out.println("Payment Sucessful..! ");
            System.out.println("Limit Remaining..: " + (UPILimit - amount));
            System.out.println();
        }
    }
}

class Check implements Payments{
    double checkamt = 100000;

    @Override
    public void makePayement(int amount) {
        if(amount >= 100000){
            System.out.println("Check Bounced..! ");
            System.out.println();
        }
        else{
            System.out.println("Payment Sucessful..! ");
            System.out.println("Check is Passes of Rupee...: "+ amount);
            System.out.println();
        }
    }
}
public class Ex_14 {
    public static void main(String[] args) {
//        Design a system where users can make payments using different modes like CreditCard, UPI, and Wallet.
//        Create an interface Payment with a method makePayment(double amount).
//        Implement this interface in three classes with their own payment rules (e.g.: balance check, credit limit).
            CreditCard cc = new CreditCard();
            cc.makePayement(1000);

            UPI upi = new UPI();
            upi.makePayement(10000);

            Check check = new Check();
            check.makePayement(10000);

    }
}
