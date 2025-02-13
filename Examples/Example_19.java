import java.util.Scanner;
public class Example_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Value of N..: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i =0;i <=n;i++){
            System.out.println("i = " + i);
            sum = sum + i;
        }
        System.out.println("Sum of First N Natural Number is..: " + sum);
    }
}
