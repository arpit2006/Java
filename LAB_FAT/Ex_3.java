package LAB_FAT;
import java.util.Scanner;
public class Ex_3 {
    public static void main(String[] args) {
        //Find the largest of three numbers.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number 1..: ");
        int n1 = input.nextInt();

        System.out.println("Enter Number 2..: ");
        int n2 = input.nextInt();

        System.out.println("Enter Number 3..: ");
        int n3 = input.nextInt();

        if(n1>n2 && n1 > n3){
            System.out.println("Number 1 is Largest..!");
        }
        else if(n2>n1 && n2 > n3){
            System.out.println("Number 2 is Largest..!");
        }
        else{
            System.out.println("Number 3 is Largest..!");
        }
    }
}
