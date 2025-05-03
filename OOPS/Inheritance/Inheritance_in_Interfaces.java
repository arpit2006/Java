package OOPS;
interface sample{
    void m1();
    void m2();
}
interface childSample extends sample{
    //class can be implemented but class can't be extended
    //the way of inheriting interface is right
    void m3();
    void m4();
}
class MySample implements childSample{
    //here we have to use all method bcoz we extended the parent method to it
    @Override
    public void m3() {
        System.out.println("Method 3");

    }

    @Override
    public void m4() {
        System.out.println("Method 4");

    }

    @Override
    public void m1() {
        System.out.println("Method 1");

    }

    @Override
    public void m2() {
        System.out.println("Method 2");

    }
}


public class Inheritance_in_Interfaces {
    public static void main(String[] args) {
        MySample ne = new MySample();
        ne.m1();
        ne.m2();
        ne.m3();
        ne.m4();

    }
}
