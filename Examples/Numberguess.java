import java.util.Scanner;

public class Numberguess {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int entered_num = 125;

        System.out.println("Enter Attempt to Guess..: ");
        int guess_number_attempt = input.nextInt();

        for (int i = 0; i <= guess_number_attempt; i++)
        {
            System.out.println("Enter Number..: ");
            int guess = input.nextInt();

            if (guess == entered_num) {
                System.out.println("You guessed it!!");
                break;
            } 
            else{
                System.out.println("Wrong Number Guess Try again..! ");    
                }

        }
    }
}
