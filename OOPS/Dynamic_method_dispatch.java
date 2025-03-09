package OOPS;
class one{
    public void main(){
        System.out.println("Java");
    }
    public void greet(){
        System.out.println("Hello");
    }
}
class two extends one{
    public void main(){
        System.out.println("Java1");
    }
}

public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        one obj = new one();
        obj.main();
        //super class refrence can be equal to subclass refrence but vice versa is not possilbe
        //It will not give error because it is superclass of the the main one it is allowed
        one boj1 = new two();
    }
}
