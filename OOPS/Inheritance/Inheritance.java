package OOPS;
class name{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in Base and Setting X Now");
        this.x = x;
    }

    public void print(){
        System.out.println("Hey..! ");
    }
}
class derive extends name{
    //We cant acess y from name because name contains only X
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in Derive and Setting Y Now");
        this.y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        name n = new name();
        n.setX(5);
        System.out.println(n.getX());

        derive b = new derive();
        b.setY(6);
        System.out.println(b.getY());
    }
}
