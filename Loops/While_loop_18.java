import java.util.Scanner;
public class While_loop_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number..: ");
        int n = input.nextInt();
        int i = 100;
//        while(i <= n){
//            System.out.println("i = " + i);
//            i++;
//        }

          while (i <= n){
              System.out.println("i = " + i);
              i++;
          }
    }
}
