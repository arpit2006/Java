import java.util.Scanner;
public class Example_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Binary String..: ");
        String a = input.nextLine();

        System.out.println("Enter Another Binary String..: ");
        String b = input.nextLine();

        String sum = a + b;

        System.out.println("Addition of Binary String is..: " + sum );
        input.close();
    }
}
