import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1..: ");
        int a = input.nextInt();

        System.out.println("Enter Case..: ");
        String operator = input.next();

        System.out.println("Enter another Number..: ");
        int b = input.nextInt();

        switch (operator){
            case "+" :
                System.out.println(a + b );
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;

        }
    }
}
