public class Ex_8 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 50, 40, 80, 90 };
        boolean istrue = true;

        for (int i = 0; i < arr.length - 1; i++) {
            // System.out.println("Elements in array is..: " + arr[i]);
            if (arr[i] > arr[i + 1]) {
                System.out.println("Not sorted");
                istrue = false;
                break;
            }
        }
        if (istrue) {
            System.out.println("Array is Sorted..! ");
        } 
        else {
            System.out.println("Not Sorted..! ");
        }

    }
}
