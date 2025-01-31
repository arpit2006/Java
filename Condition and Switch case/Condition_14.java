import java.util.Scanner;
public class Condition_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your age..: ");
        int age = input.nextInt();
        if ( age >=18){
            System.out.println("Your are Eligible to vote..! ");
        }
        else
            System.out.println("Not eligible");

    }
}
