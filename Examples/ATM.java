import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        
// 3. ATM Transaction System (For Loop & While Loop)
// 🔹 Scenario:
// An ATM allows a user to withdraw cash a maximum of 3 times in one session.
// 🔹 Question:
// Use a for loop to allow 3 attempts.
// If the user enters an incorrect PIN 3 times, block the card.
// Use a while loop to ensure the withdrawal amount does not exceed the account balance. 
// If the withdrawal amount exceeds the account balance, display an error message.

        Scanner input = new Scanner(System.in);
        int pin = 2006;
        int balance = 10000;
        boolean authentication = false;
        for (int i =0; i < 3;i++){
            System.out.println("Enter PIN..: ");
            int entered_pin = input.nextInt();
            if (entered_pin == pin){
                authentication = true;
                System.out.println("Acess Granted..! ");
                break;
            }
            else{
                System.out.println("Invalid..! ");
            }
        }

        if(!authentication){
            System.out.println("Card Blocked Contact Branch Manager..! ");
            
        }
        else{
        while (true) {
            System.out.println("Enter Amount to WidthDrawl..: ");
            int amt = input.nextInt();

            if ( amt > balance) {
                System.out.println("Fuck You! Insufficient Balance..! ");
                break;
        }
        else if ( amt < 0){
            System.out.println("Invalid Amount..! ");
        }
        else{
            int bal = balance - amt;
            System.out.println("WidthDrawl SucessFul..! ");
            System.out.println("Remaining Balance..: " + bal);
            break;
        }
    }


    }
}
}