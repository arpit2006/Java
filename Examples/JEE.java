import java.util.*;

public class JEE {
    public static void main(String[] args) {
        /*It will take age name Bdate input
        and cast according to cast it will show the result of the application form

        after application no will be displayed
         */
        Scanner input = new Scanner(System.in);


        System.out.println("Enter Your Name..: ");
        String name = input.nextLine();

        System.out.println("Enter Your Age..: ");
        int age = input.nextInt();

        System.out.println("Enter Your Birth Date..: ");
        int Bdate = input.nextInt();

        System.out.println("Enter Your Cast..: ");
        String cast = input.next();

        if(age >=15){
            if(cast.equalsIgnoreCase("Genral")){
                System.out.println("You are Eligile For JEE Mains..! ");
                System.out.println("Sorry No Reservation For You,,! ");
            }
            else if (cast.equalsIgnoreCase("OBC")) {
                System.out.println("You are Eligile For JEE Mains..! ");
                System.out.println("Sorry only 10% Reservation For You,,! ");
            }
            else if (cast.equalsIgnoreCase("SC")) {
                System.out.println("You are Eligile For JEE Mains..! ");
                System.out.println("Great 30% Reservation For You,,! ");
            }
            else if (cast.equalsIgnoreCase("ST")) {
                System.out.println("You are Eligile For JEE Mains..! ");
                System.out.println("Great 50% Reservation For You,,! ");
            }
            else{
                System.out.println("Not Eligible for JEE Mains..! ");
            }

            int  Application = Bdate+age;
            System.out.println("Your Application Number is...: " + Application);

        }
    }
}
