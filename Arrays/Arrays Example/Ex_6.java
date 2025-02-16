public class Ex_6 {
    public static void main(String[] args) {
        int [] arr = {10,20,30,50,40,5};
        int max = arr[5];
        for (int i = 0; i < arr.length;i++){
            System.out.println("Elements of Array is...: " + arr[i]);

            if (max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("Maximum Number in arrays is..: " + max);
    }
    
}
