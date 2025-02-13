import java.util.Scanner;
public class Example_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value of N..: ");
        int n = input.nextInt();
        int mul = 1;
        for (int i = 1;i <=n;i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}
