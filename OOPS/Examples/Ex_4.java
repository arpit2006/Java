package OOPS;
class getsum{
    int a;
    int b;
    int result;
    public int Getsum(){
        result = (a+b);
        return result;

    }
}
public class Ex_4 {
    public static void main(String[] args) {
        getsum gs = new getsum();
        gs.a = 100;
        gs.b = 200;
        gs.Getsum();
        System.out.println("Addition is...: " + gs.Getsum());
    }
}
