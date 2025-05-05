package LAB_FAT;
import java.util.Scanner;
abstract class Shapes{
    abstract void area();
}
class Triangle extends Shapes{
    int height;
    int base;

    @Override
    void area() {
        System.out.println("Area of Triangle is..: " + (0.5*height*base));
    }
}

class Circlee extends Shape{
    double radius;

    @Override
    void area() {
        System.out.println("Area of Circle is..: " + (3.14*radius*radius));
    }
}
class Square extends Shapes{
    int side;

    @Override
    void area() {
        System.out.println("Area of Square..: " + (side*side));
    }
}

public class Ex_11 {
    public static void main(String[] args) {
        //Abstract Class for Shapes
        //Description:
        //Create an abstract class Shape with an abstract method area(). Extend it in classes Triangle, Circle, and Square, and implement area calculation accordingly.
        //🔹 Concepts Covered: Abstract Classes, Polymorphism
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Height of Triangle..: ");
        int height = input.nextInt();

        System.out.println("Enter base of triangle..: ");
        int base = input.nextInt();

        System.out.println("Enter Radius of Circle..: ");
        int radius = input.nextInt();

        System.out.println("Enter side of Square..: ");
        int side = input.nextInt();

        Triangle tri = new Triangle();
        tri.height = height;
        tri.area();

        Circlee cc = new Circlee();
        cc.radius = radius;
        cc.area();

        Square sq = new Square();
        sq.side = side;
        sq.area();
    }
}
