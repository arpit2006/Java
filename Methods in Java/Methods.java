public class Methods {
     static int logic(int a,int b){
        // If we are not using static here then we have to call object inside the code
        int c;
        if (a > b){
            c = (a+b);
            System.out.println(c);
        }
        else{
            c = (a+b)*5;
            System.out.println(c);
        }
        //if we change or modify the values in method it will not reflect the change
        return  c;
    }
    public static void main(String[] args) {

        int a = 5;
        int b = 7;
        int c;
        //Methods invocation using object creation
        // when we do not use static method we have to use this
        //But generally we will use static methods only
//        Methods obj = new Methods();
        c = logic(a,b);

        int a1 = 2;
        int b1 = 1;
        int c1;
        c1 = logic(a1,b1);
        System.out.println(c);
        System.out.println(c1);

    }
}
