import java.util.Scanner;
public class Switch_Case_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your age..: ");
        int age = input.nextInt();

        switch (age){
            case 18:
                System.out.println("Adult");
                break;
            case 25:
                System.out.println("Adult + Teenager");
                break;
            case 50:
                System.out.println("old");
                break;
        }
    }
}
