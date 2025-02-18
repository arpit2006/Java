package Resurrsion;

public class Recurssion {
    static int  factorial(int n) {
        //Recursive approach
        //factorial (n) = n* factorial(n-1) n >=1
//        if (n == 0 || n == 1)
//        {
//            return 1;
//        }
//        else{
//            return (n * factorial(n-1));
//            //return stores the value and then passes to the System statement
//        }
        //Iterative approach
        int factorial1 = 1;
        for (int i = n; i >= 1; i--) {
            if (n == 1 || n == 0){
                return 1;
            }
            else{
            factorial1 = factorial1 * i;
            }
        }
        return factorial1;
    }
    //Recursion in java
    public static void main(String[] args) {
        System.out.println("Recursion in Java....! ");
        System.out.println("The value of factorial is..: " + factorial(5));
        System.out.println("The value of factorial is..: " + factorial(0));
    }
}
