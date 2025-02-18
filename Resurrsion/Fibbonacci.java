package Resurrsion;

public class Fibbonacci {
    static int fibbonacci (int n){
        if (n == 0 ){
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else{
            return fibbonacci(n - 1) + fibbonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int a = 5;
        for (int i = 0;i < a;i++){
            System.out.println(i + " ");
        }
    }
}
