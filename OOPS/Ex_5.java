package OOPS;
class  getsubs{
    int a;
    int b;
    int result;
    public int Getsubs(){
        result = (a-b);
        return result;
    }
}

public class Ex_5 {
    public static void main(String[] args) {
        getsubs nums = new getsubs();
        nums.a = 200;
        nums.b = 100;
        int re = nums.Getsubs();
        System.out.println("Substraction of Numbers is...: " + re);
    }
}
