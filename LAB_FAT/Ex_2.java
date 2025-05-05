package LAB_FAT;
import java.util.Scanner;
public class Ex_2 {
    public static void main(String[] args) {
        //Take two numbers as input and print their sum.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number 1..: ");
        int n1 = input.nextInt();

        System.out.println("Enter Second Number..: ");
        int n2 = input.nextInt();

        System.out.println("Sum of two numbers is..: " + (n1+n2));

    }
}
