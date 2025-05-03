package OOPS;
class area{
    private int radius;
    private float pi;
    public int getRadius(){
        //Get will always return value
        return radius;
    }
    public void setRadius(int n){
        //Set will always take argument
        radius = n;
    }
    public float getPi(){
        return pi;
    }
    public void setPi(float pii){
        pi = pii;
    }
    public void areaofcircle(){
        System.out.println("Area is..: " + (radius*pi));
    }

}

public class Ex_9 {
    public static void main(String[] args) {
        area inputs = new area();

        inputs.setRadius(5);
        inputs.setPi(3.14f);
        inputs.areaofcircle();


    }
}
