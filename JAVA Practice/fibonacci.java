public class fibonacci {
    static int fibonacci(int a){
        //  0 1 1 2 3 5 8
        if (a <= 1){
            return a;
        }
        else{
            return fibonacci(a-1) + fibonacci(a-2);
        }
    }

    public static void main(String[] args) {
        
        int n = 5;
        for( int i = 0; i <= n; i++){
        System.out.print(fibonacci(i) + " ");
        }
    }
    
}
