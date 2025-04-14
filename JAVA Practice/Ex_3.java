public class Ex_3 {
    public static void main(String[] args) {
        int [] marks_phy = {10,20,30,40,50};
        int sum = 0;
        int average = 0;

        for (int i = 0; i < marks_phy.length;i++){
            System.out.println("Arrays of Marks is..: " + marks_phy[i]);
            sum = sum + marks_phy[i];
            average =  sum / marks_phy.length;
        }
        System.out.println("Total Marks is..: " + sum);
        System.out.println("Average is..: " + average);
    }
}
