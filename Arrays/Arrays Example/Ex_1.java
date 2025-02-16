public class Ex_1{
    public static void main(String[] args) {
        float [] num = {10.1f,10.2f,10.3f,10.4f,10.5f};
        float sum = 0;
        for (int i = 0; i < num.length;i++){
            System.out.println("Numbers in Array's are..: " + num[i]);
            sum = sum + num[i];
        }
        System.out.println("Sum of Arrays is...: " + sum);

    }
}