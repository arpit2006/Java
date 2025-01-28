import java.util.Scanner;
public class Example_1 {
    public static void main(String[] args) {

        Scanner marks = new Scanner(System.in);

        System.out.println(" Enter Total  Marks..: ");
        int total = marks.nextInt();

        System.out.println("Enter Marks of Maths..: ");
        int maths = marks.nextInt();

        System.out.println("Enter Physcis Marks..: ");
        int physcis = marks.nextInt();

        System.out.println("Enter Chemistry Marks...: ");
        int chemistry = marks.nextInt();

        System.out.println("Enter Biology Marks..: ");
        int biology = marks.nextInt();

        float total_marks = physcis + chemistry + maths + biology;
        System.out.println(total_marks);
        float percentage = (total_marks / total) * 100;

        System.out.println("Your Percentage is..: ");
        System.out.println(percentage);

    }
}
