import java.util.Scanner;
public class Supermarket_queue {
//     🔹 Scenario:
// A grocery store has a queue of customers. The cashier serves one customer at a time until all customers are served.

// 🔹 Question:

// Use a while loop to process customers in a queue.
// Reduce the queue count after serving each customer.
// Stop when there are no customers left.
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter Number of People in Queue..:  ");
    int queue = input.nextInt();
        while (queue > 0) {
            System.out.print("Enter Amount of Purchase: ");
            int amt1 = input.nextInt();
            input.nextLine(); // Consume newline

            System.out.print("Enter Payment Method (Cash, Card, UPI): ");
            String pay1 = input.nextLine();
            
            if(pay1.equalsIgnoreCase("Cash")){
                System.out.println("No Discount..! Your Final Amount..: " + amt1);
                break;
            }
            else if(pay1.equalsIgnoreCase("Card")){
                double finamt = (amt1 - (amt1 * 0.05));
                System.out.println("5% Discount..! Your Final Amount..: " + finamt  );
                break;
            }
            else if(pay1.equalsIgnoreCase("UPI")){
                double amt2 = (amt1 - (amt1 * 0.10));
                System.out.println("10% Discount..! Your Final Amount..: " + amt2 );
                break;
            }
            else{
                System.out.println("Invalid Method..! ");
            }
                queue--;
        }
        System.out.println("Thanks for Shopping Visit Again..!");
    }
}



