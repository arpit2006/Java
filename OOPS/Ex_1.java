
package OOPS;
import java.util.Scanner;
class EmployeeDetails {
    int salary;
    String name;
    String Changename;
    public int getsalary(){
        return salary;
    }
    public  String getname(){
        return name;
    }
    public  String setname(){
        return Changename;
    }
}

public class Ex_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee Arpit = new Employee();
        Employee Batla = new Employee();

        Arpit.salary = 100000;
        Arpit.name = "Harry";
        System.out.println("Enter name to be changed..: ");
        String name_c = input.nextLine();

        System.out.println("Your Salary..: " + Arpit.salary);
        System.out.println("Your name..: " + Arpit.name);
        System.out.println("Changed name..: " + name_c);

    }
}
