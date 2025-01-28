import java.util.Scanner;
public class Example_4 {
    public static void main(String[] args) {
        //Kilometer to miles
        Scanner Kilometer = new Scanner(System.in);

        System.out.println("Enter Value --> ");
        System.out.println("Enter Distance in Kilometer..: ");
        int distance = Kilometer.nextInt();

        double miles = distance * 0.621;

        System.out.println("Distance in Miles..: ");
        System.out.println(miles + " Miles");

    }
}
