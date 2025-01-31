import java.util.Scanner;
public class Example_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String..: ");
        String name = input.nextLine();
        System.out.println(name.indexOf("  "));
        System.out.println(name.indexOf("   "));

    }
}
