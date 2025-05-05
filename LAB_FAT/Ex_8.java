package LAB_FAT;
import java.util.Scanner;
abstract class Shape{
    abstract void area();
}
class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
   public void area() {
        System.out.println("Area of Circle is..: " + (3.14*radius*radius));
    }
}
class Rectangle extends Shape{
    int length;
    int breadth;
    public Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle is..: " + (length*breadth));
    }
}

public class Ex_8 {
    public static void main(String[] args) {
        // Use abstract class Shape with area() method. Implement in Circle and Rectangle.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Radius..: ");
        double r = input.nextDouble();

        Circle circle = new Circle(r);
        circle.area();



        System.out.println("Enter length..: ");
        int len = input.nextInt();

        System.out.println("Enter Width..: ");
        int bre = input.nextInt();

        Rectangle rectangle = new Rectangle(len,bre);
        rectangle.area();


    }

}
