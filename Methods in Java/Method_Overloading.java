package Arrays;

public class Method_Overloading {
    static  void telljoke() {
        //static is used to associate a method class with the class
        //void is used when we do not want to return something
        System.out.println("Hello World..! ");
    }
    static void change(int a ){
        a = 98;
    }
    static void  change2(int [] arr){
        arr[0] = 98;
    }
    public static void main(String[] args) {
        //using static method we can directly call the function without sout
        telljoke();
    // Changing the integer
//        int a = 45;
//        change(a);
//        System.out.println(a);

        //case 2
        int [] num = {10,20,30,40,50};
        //here where the array memory is located the memory is passed in change method hence arr[0] changes
        change2(num);
        System.out.println( num[0]);



    }
}
