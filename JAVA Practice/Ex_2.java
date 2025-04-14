import java.util.Scanner;

public class Ex_2 {
    // Write a Java program that takes two numbers as input from the user and
    // divides the first number by the second. Use exception handling to prevent
    // division by zero and handle invalid input cases.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        try{
        System.out.println("Enter Number 1..: ");
        int num1 = input.nextInt();

        System.out.println("Enter Number 2..: ");
        int num2 = input.nextInt();

        int result = num1 / num2;
        System.out.println("Result is..: " + result);
        }
        catch(ArithmeticException e){
            System.out.println("Division by Zero is not possible..! ");
        }
       input.close(); 
    }

}