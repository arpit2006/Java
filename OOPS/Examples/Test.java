package OOPS;
import java.util.Scanner;
public class Test {
    public static void guess(int n){
        Scanner input = new Scanner(System.in);
        for(int i = 1;i<=n;i++)
        {
            System.out.println("Enter Name of " + i + " Person..!  ");
            String name = input.nextLine();
            if(name.startsWith("A"))
            {
                System.out.println("You are the Winner..! ");
                break;
            }
            else
            {
                System.out.println("No Winner Found..! ");

            }
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Person..: ");
        int n = input.nextInt();
        guess(n);

    }
}
