package Methods_Practice;
class circle{
    int radius;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radii){
        radius = radii;
    }
    public void finalarea_circle(){
        double area = 3.13*3.14*getRadius()*getRadius();
        System.out.println("Area of Circle is..: " + area);

    }
}
class cyliner extends circle{
    int lenght1;

    public int getLenght1() {
        return lenght1;
    }

    public void setLenght1(int lenght) {
        lenght1 = lenght;
    }
    public void finalarea_cylinder(){
        double area1 = 2*3.14*getLenght1();
        System.out.println("Area of Circle is..: " + area1);

    }
}

public class Ex_8 {
    public static void main(String[] args) {
        // create a class circle and use inheritance and derive circle from it
        circle obj = new circle();
        obj.setRadius(10);
        obj.finalarea_circle();

        cyliner obj1 = new cyliner();
        obj1.setLenght1(10);
        obj1.finalarea_cylinder();


    }
}
