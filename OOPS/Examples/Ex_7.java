package OOPS;
class Mul{
    int n;
    int m;
    public int mul(){
        if (n==0 && m == 0){
            return 0;
        }
        else{
        return (n*m);
        }
    }
}
public class Ex_7 {
    public static void main(String[] args) {
        Mul num = new Mul();
        num.n = 20;
        num.m = 10;
        int result = num.mul();
        System.out.println("Multiplication is...: " + result);
    }
}
