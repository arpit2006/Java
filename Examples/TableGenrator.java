import java.util.Scanner;
public class TableGenrator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of table you want to generate..: ");
        int a = input.nextInt();

        for (int i = 1; i <=10;i++){
            System.out.println(a + " x " + i + " = " + (a*i) );
        }
    }
}
