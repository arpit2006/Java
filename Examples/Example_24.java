package Examples;
import java.util.Scanner;
public class Example_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of an Array..: ");
        int size = input.nextInt();
        int [] marks = new int[size];
        for (int i = 0; i < size;i++){
            System.out.println("Enter " + i + " Element..: ");
            marks[i] = input.nextInt();
        }
        for(int j = 0; j < marks.length;j++){
            System.out.println("Elements in Arrays is..: ");
            System.out.println(marks[j]);
        }

    }
}
