package Methods_Practice;
class Rectangle{
    int lenght;
    int breadth;
    public int getLenght(){
        return lenght;
    }
    public void setLenght(int len){
        lenght = len;
    }
    public int getBreadth(){
        return  breadth;
    }
    public void setBreadth(int bread){
        breadth = bread;
    }
    public void final_area(){
        System.out.println("Lenght of Rectangle is..: " + getLenght());
        System.out.println("Breadth of Rectangle is..: " + getBreadth());
        System.out.println("Area of Rectangle is..: " + getLenght()*getLenght());
    }
}
class cuboid extends Rectangle{
//     2 (lw + wh + lh)
    int lenght1;
    int width;
    int height;

    public int getLenght1(){
        return lenght1;
    }
    public void setLenght1(int len){
        lenght1 = len;
    }

    public int getWidth(){
        return width;
    }
    public void setWidth(int wid){
        width = wid;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int hei){
        height = hei;
    }

    public void final_area_cuboid(){
        System.out.println("Lenght of Rectangle is..: " + getLenght1());
        System.out.println("Width of Rectangle is..: " + getWidth());
        System.out.println("Height of Cuboid is..: " + getHeight());
        int area = 2*getWidth()*getHeight();
        System.out.println("Area of Cuboid is..: " + area);
    }

}

public class Ex_9 {
    public static void main(String[] args) {
        cuboid obj1 = new cuboid();
        
    }
}
