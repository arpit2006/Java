package Examples;
//Taking input in an array an calculating sum
import java.util.Scanner;

public class Example_25 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of an Array..: ");
        int size = input.nextInt();
        int [] arr = new int [size];
        for(int i = 0; i < size;i++){
            System.out.println("Enter " + i + " Element..: ");
            arr[i] = input.nextInt();
        }
        for(int j = 0;j < arr.length;j++){
            sum = sum + arr[j];
        }
        System.out.println(sum);

    }
}
