import java.util.Scanner;
public class User_input {
    public static void main(String[] args) {
        System.out.println("Taking Input From User..!");
        // To take Input From user Java has a Scanner Class
        Scanner sc = new Scanner(System.in); // Class for taking Input

        System.out.println("Enter Number 1..: ");
        int a = sc.nextInt(); // Value stores here

        boolean b1 = sc.hasNextInt();
//        System.out.println(b1); // Checks if the input is taken or not in interger

        System.out.println("Enter Number 2..: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The Sum of Numbers is..: ");
        System.out.println(sum);
    }
}
