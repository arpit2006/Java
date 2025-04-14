public class Ex_7 {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 8, 2, 7, 0 };
        int min_no = arr[0];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Elements of Arrays is..: " + arr[i]);

            if (min_no > arr[i])
            {
                min_no = arr[i];
            }
        }
        System.out.println("Minimun Number in an array is..: " + min_no);

    }

}
