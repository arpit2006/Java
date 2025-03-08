package Methods_Practice;
class surface_cylinder{
    int lenght;
    int radius;
    public int getLenght(){
        return lenght;
    }
    public void setLenght(int len){
        lenght = len;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radi) {
         radius = radi;
    }
    public void surface_area(){
        double area = 2*3.14*getLenght()*getRadius()+2*3.14*3.14*getRadius();
        System.out.println("Surface Area is..: " + area);
    }
}

public class Ex_6 {
    public static void main(String[] args) {
        surface_cylinder obj = new surface_cylinder();
        obj.setRadius(10);
        obj.setLenght(10);
        obj.surface_area();
    }
}
