import java.util.Scanner;
public class Else_if_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age..: ");
        int age = input.nextInt();
        if ( age > 50){
            System.out.println("You are God..! ");
        } else if (age > 46) {
            System.out.println("Legend");

        }
        else{
            System.out.println("Noob");
        }
    }
}
