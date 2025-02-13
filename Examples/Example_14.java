import java.util.Scanner;
public class Example_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Physcis Marks...: ");
        int physcis = input.nextInt();

        System.out.println("Enter Your Chemistry Marks...: ");
        int Chemistry = input.nextInt();

        System.out.println("Enter Your Math Marks...: ");
        int Math = input.nextInt();
        float Totalmarks = physcis + Chemistry + Math;
        int max_mark = 300;
        System.out.println(Totalmarks);


        float Percentage = (Totalmarks/max_mark) * 100;
        System.out.println(Percentage);
        if (Percentage >=33)
        {
            System.out.println("You Are Pass..! ");
        }
        else{
            System.out.println("You Are Fail....! ");
        }

    }
}
