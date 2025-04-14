import java.util.Scanner;
public class Example_7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number..: ");
        int n = input.nextInt();
        int k = 0;
        int last_digit = 0;
        int orignal = n;

        while ( n != 0){
            last_digit = n % 10;
            k = k + (last_digit * last_digit * last_digit);
            n = n / 10;
        }
        if(orignal == k){
            System.out.println("Armstrong..! ");
        }
        else{
            System.out.println("Nothing..! ");
        }
        input.close();

    }
}
