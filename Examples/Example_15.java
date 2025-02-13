import java.util.Scanner;
public class Example_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Income..: ");
        int income = input.nextInt();

        // 2 - 5 L 5%
        // 5 - 10 L 10%
        // 10 - 15 L 15%
        //15 - 20 L 20%
        //Greater > 20L 30%

        if (income >= 200000 && income < 500000){
            System.out.println("Your Applicable Tax is 5% on your Income");
        }
        else if ( income >= 500000 && income < 1000000) {
            System.out.println("Your Applicable Tax is 10% on your Income");
        }
        else if( income >=1000000 && income < 2000000){
            System.out.println("Your Applicable Tax is 15% on your Income ");
        }
        else{
            System.out.println("Your Applicable Tax is 30% on your Income");
        }

    }
}
