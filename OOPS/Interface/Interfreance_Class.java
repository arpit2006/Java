package OOPS;
interface GetArea{
    void findAre(int radius);
    void FindArea(int lenght,int width);
}
class Final_Area implements GetArea{
    @Override
    public void findAre(int radius) {
        System.out.println("The Area of Circle is..: " + (3.14*radius*radius));
    }

    @Override
    public void FindArea(int lenght, int width) {
        System.out.println("The Area of Rectangle is..: " + (lenght*width));
    }
}

public class Interfreance_Class {
    public static void main(String[] args) {
        Final_Area sc = new Final_Area();
        sc.findAre(10);
        sc.FindArea(10,20);


    }
}
