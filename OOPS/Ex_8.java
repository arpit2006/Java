package OOPS;
class Voting{
    int age;
    String gender;
    public void voting(){
        if (age >=18 && gender.equalsIgnoreCase("male"))
        {
            System.out.println("Your Gender is...: " + gender);
            System.out.println("Your Age is...: " + age);
            System.out.println("Your Voting is scheduled on Monday(24 February)");
        }
        else if (age >= 18 && gender.equalsIgnoreCase("female"))
        {
            System.out.println("Your Gender is...: " + gender);
            System.out.println("Your Age is...: " + age);
            System.out.println("Your Voting is scheduled on Sunday(23 February)");

        }
        else
        {
            System.out.println("Not Eligible to Vote...! ");
        }

    }
}

public class Ex_8 {
    public static void main(String[] args) {
        Voting name = new Voting();
        name.age = 20;
        name.gender = "Male";
        name.voting();


    }
}
