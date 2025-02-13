import  java.util.Scanner;
public class Example_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Year..: ");
        int year = input.nextInt();

        if (year % 100 == 0 && year % 400 == 0){
            System.out.println("The Year is Leap Year..! ");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("The Year is Leap year..! ");
        }
        else {
            System.out.println("The Year is not a Leap Year..! ");
        }
    }
}
