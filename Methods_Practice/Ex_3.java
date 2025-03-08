package Methods_Practice;
import java.util.Scanner;

public class Ex_3 {
    public static void arr_sum(int size ){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int [] marks1 = new int [size];
        for(int i = 0;i < size;i++){
            System.out.println("Enter Marks....: ");
            marks1[i] = input.nextInt();
        }
        for (int j = 0;j < marks1.length;j++){
            System.out.println("Elements of an Array is..: ");
            System.out.println(marks1[j]);
            sum = sum + marks1[j];
        }
        System.out.println("Sum of an Array is..: " + sum);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Elements Size..: ");
        int num = input.nextInt();
        arr_sum(num);
    }
}
