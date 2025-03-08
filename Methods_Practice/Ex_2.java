package Methods_Practice;
import java.util.Scanner;
//table
public class Ex_2 {
    public static void table(int nunmber){
        for(int i = 1;i <=10;i++){
            System.out.println(nunmber + "x" + i + "=" + (nunmber*i));
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number...: ");
        int n = input.nextInt();
        table(n);

    }
}
