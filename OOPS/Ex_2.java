package OOPS;
class rectangle{
    int length;
    int breadth;
    public void area(){
        System.out.println("Area is..: " + (length * breadth));
    }
    public void perimeter(){
        System.out.println("Perimeter is..: " + (2*(length * breadth)));
    }
}

public class Ex_2 {
    public static void main(String[] args) {
        rectangle Area  = new rectangle();
        rectangle perimeter = new rectangle();

        Area.length = 10;
        Area.breadth = 20;
        Area.area();

        perimeter.length = 10;
        perimeter.breadth = 20;
        perimeter.perimeter();

    }
}
