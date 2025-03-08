package Methods_Practice;
import java.util.*;
//Methods to find Odd and even


public class Ex_1 {
    public static void even_odd(int number) {

        if (number % 2 == 0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("ODD");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number..: ");
        int n = input.nextInt();
        even_odd(n);


        
    }
    
}
