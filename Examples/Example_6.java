public class Example_6 {
    public static void main(String[] args) {

        //Encrypting grade
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);


        //Decrypting grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
