import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        // 5. Employee Bonus System
        // An employee receives a bonus based on years of service:

        // More than 10 years: 10% of salary
        // Between 6 to 10 years: 8% of salary
        // Less than 6 years: 5% of salary
        // Write a program that takes salary and years of service as input and
        // calculates the final salary after adding the bonus.'
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Salary of this month...: ");
        int salary = input.nextInt();
        System.out.println("Enter Years of Services....: ");
        int years = input.nextInt();
        

        if(years < 5){
            double bonus = salary*(0.1);
            double final_salary1 = (salary) + bonus;
            System.out.println("Final Salary is: "+final_salary1);
        }
        else if(years >=5 && years <=10){
            double bonus2 = (salary)*(0.15);
            double final_salary2 = salary + bonus2;
            System.out.println("Final Salary is: "+final_salary2);
        }
        else if (years > 10){
            System.out.println("You are Valuable Employee....! ");
            double bonus1 = (salary)*(0.5);
            double final_salary3 = salary + bonus1;
            System.out.println("Final Salary is: "+final_salary3);
        }
        else{
            System.out.println("You areb not our Employee..! ");
        }
        input.close();
    }

}
