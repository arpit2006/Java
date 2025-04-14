import java.util.Scanner;
public class Example_9 {
    public static void main(String[] args) {
        // Odd or even
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number..: ");
        int num = input.nextInt();
        if (num % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        input.close();
    }
}
