import java.util.Scanner;
public class Example_7 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter a Number..: ");
        int a = number.nextInt();

        System.out.println(a > 8);
    }
}
