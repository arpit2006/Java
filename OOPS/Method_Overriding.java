package OOPS;
class A{
    public int arpit(){
        return 18;
    }
    public void mt1() {
        System.out.println("Hello...! ");
    }
}
class B extends A{
    public void mt2(){
        System.out.println("Hello");
    }


}

public class Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
//        a.mt1();
        B b = new B();
        b.mt2();

    }
}
