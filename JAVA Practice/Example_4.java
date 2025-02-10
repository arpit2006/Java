import java.util.Scanner;
public class Example_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp = 0;
        System.out.println("Enter a Number..: ");
        int a = input.nextInt();

        System.out.println("Enter a Number..: ");
        int b = input.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("Interchange value of a is..: " + a);
        System.out.println("Interchange value of b is..: " + b);
    }
}
