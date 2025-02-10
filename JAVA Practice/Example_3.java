import java.util.Scanner;
public class Example_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Decimal Number..: ");
        float a = input.nextFloat();

        System.out.println("Enter another Decimal Number..: ");
        float b = input.nextFloat();

        float sum = a + b;

        System.out.println("Sum of Float Numbers is..: " + sum);
    }
}
