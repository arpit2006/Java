import java.util.Scanner;
public class Example_3 {
    public static void main(String[] args) {
        Scanner Add_Number = new Scanner(System.in);
        System.out.println("Enter Numbers --> ");

        System.out.println("Enter Number 1..: ");
        int num1 = Add_Number.nextInt();

        System.out.println("Enter Number 2..: ");
        int num2 = Add_Number.nextInt();

        System.out.println("Enter Number 3..: ");
        int num3 = Add_Number.nextInt();

        int sum = num1 + num2 + num3;

        System.out.println("Sum is..: ");
        System.out.println(sum
        );

    }
}
