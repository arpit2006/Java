import java.util.Scanner;
public class Example_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1..: ");
        int num1 = input.nextInt();

        System.out.println("Enter Number 2..: ");
        int num2 = input.nextInt();

        System.out.println("Enter Number 3..: ");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("Number 1 is Largest..!  ");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Number 2 is Largest..! ");
        }
        else{
            System.out.println("Number 3 is Largest..! ");
        }
        input.close();
    }
}
