package Methods_Practice;
class cylinder{
    int length;
    int radius;
    public int getLength(){
        return length;
    }
    public void setLength(int len){
        length = len;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int ra){
        radius = ra;
    }

    public void area(){
        System.out.println("Length..: " + getLength());
        System.out.println("Radius is..: " + getRadius());
        System.out.println("Area is..: " + (getLength()* getRadius()));
    }
}

public class Ex_5 {
    public static void main(String[] args) {
        cylinder obj = new cylinder();
        obj.setLength(14);
        obj.setRadius(10);
        obj.area();
    }
}
