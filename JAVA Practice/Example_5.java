import java.util.Scanner;
public class Example_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number..: ");
        int a = input.nextInt();
        int square = (a*a);
        System.out.println("Square of Number is..: " + square);
        int sum = 0;
        int last_digit = 0;

        while (square != 0){
            last_digit = square % 10;
            sum = sum + last_digit;
            square = square / 10;
        }
        System.out.println("Sum of Square is..: " + sum);

        if (sum == a){
            System.out.println("N eon Number..! ");

        }
        else {
            System.out.println("Not a Neon Number..! ");
        }
    }
}
