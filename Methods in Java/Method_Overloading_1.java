package Arrays;

public class Method_Overloading_1 {
    //This methods are not same
    //We cant overload a function by changing the type
        static void foo(){
            System.out.println("Good Morning..! ");
        }
        //here parameter are provided

        //Here both foo are different because the first one takes no argument and the second one takes the argument
        static void foo(int a ){
            System.out.println("Good Morning..: " + a);
        }
        static void foo(String x){
            System.out.println("Hello..! " + x);
        }
    public static void main(String[] args) {
            foo();
            foo(2000000);
            //This are the argument provided here and argument are actual
            foo("Arpit Shirbhate ");
    }
}
