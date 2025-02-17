package Arrays;

public class Variable_Argument {
//    static  int sum(int a , int b){
//        return a + b;
//    }
//    static int sum(int a ,int b ,int c){
//        return a+b+c;
//    }
    /// After creating this method which stores the values in the form of array and the multiple arguments can pass
    static int sum( int s,int ...arr){
        int result = s;
        for(int a :arr ){
            result = result + a;
        }
        return result;
    }
    public static void main(String[] args) {
        //in variable argument
        System.out.println("Welcome to Java Course..! ");
        System.out.println("Sum of 10 and 20 is...: " + sum(10));
        System.out.println("Sum of 10 and 20 is...: " + sum(10,20));
        System.out.println("Sum of 10,20,30 is...: " + sum(10,20 ,30));
    }
}
