import java.util.Scanner;
public class Example_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number..: ");
        int n = input.nextInt();
        for (int i = 1;i <= n;i++){
//            System.out.println(i);
            if ( i % 2 == 0){
                System.out.println("Non Prime.: " + i);

            }
            else{

                System.out.println("Prime : " + i);
            }

        }
        input.close();
    }
}
