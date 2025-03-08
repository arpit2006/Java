package Methods_Practice;
//Jee Form
//Name bDate age cast

import java.util.Scanner;

public class Ex_4 {
    public static void form(int age,String name,String cast,String BDate){
        System.out.println("Your name is..: " + name);
        System.out.println("Your BirthDate is..: " + BDate);
        System.out.println("Your Age..: " + age);
        System.out.println("Your Cast is..: " + cast);
        if (age >=15){
            if(cast.equalsIgnoreCase("OBC")){
                System.out.println("You Have 10% Reservation..!");
            }
            else if (cast.equalsIgnoreCase("Genral")) {
                System.out.println("You have No Reservation..! ");
            }
            else if (cast.equalsIgnoreCase("SC")) {
                System.out.println("You have 30% Reservation..! ");
            }
            else if (cast.equalsIgnoreCase("ST")) {
                System.out.println("You have 50% Reservation..! ");
            }
            else{
                System.out.println("No Applicable Case");
            }

            System.out.println("Your Application Number..: " + (BDate));
        }
        else {
            System.out.println("You are Not Applicable For JEE Main");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name..: ");
        String naame = input.nextLine();
        System.out.println("Enter Yout Birth Date..: ");
        String Bdate = input.nextLine();
        System.out.println("Enter Your Age..: ");
        int agge = input.nextInt();
        System.out.println("Enter Your Cast..: ");
        String caast = input.next();
        form(agge,naame,Bdate,caast);

        input.close();
    }
}
