import java.util.Scanner;

public class Example_15 {
    public static void main(String[] args) {
        // 3. ATM Transaction System (For Loop & While Loop)
        // 🔹 Scenario:
        // An ATM allows a user to withdraw cash a maximum of 3 times in one session.
        //
        // 🔹 Question:
        //
        // Use a for loop to allow 3 attempts.
        // If the user enters an incorrect PIN 3 times, block the card.
        // Use a while loop to ensure the withdrawal amount does not exceed the account
        // balance.
        Scanner input = new Scanner(System.in);
        int correct_pin = 1234;
        boolean authent = false;
        int ini_bal = 10000;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Pin..: ");
            int entered_pin = input.nextInt();
            if (entered_pin == correct_pin) {
                authent = true;

                System.out.println("Acess Granted..! ");
                break;
            } else {
                System.out.println("Failed.! ");

            }
        }
        if (!authent) {
            System.out.println("Card Blocked..! ");
        }
        while (true) {
            System.out.println("Enter Amount to widthdrawl..: ");
            int width_amt = input.nextInt();
            if (width_amt > ini_bal) {
                System.out.println("Fuck You..! ");
                break;
            } else if (width_amt < 0) {
                System.out.println("Enter Positive Value..! ");
            } else {
                int bal = ini_bal - width_amt;
                System.out.println("Balance is..: " + bal);
            }
        }
        input.close();

    }
}
