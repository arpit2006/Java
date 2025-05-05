package LAB_FAT;
abstract class Company{
    String name;
    int salary;
    String id;
    abstract void calculateSalary(int amount);
}
class Employee extends Company{
    public Employee(String name,int Salary,String id){
        this.name = name;
        this.id = id;
        this.salary = Salary;
    }
    @Override
    void calculateSalary(int amount) {
        System.out.println("Your Salary is..: " + amount);
        salary = amount;
    }
    public void dispalyDetails(){
        System.out.println("You are Classic Employee...! ");
        System.out.println("Your name..: " + name);
        System.out.println("Your Employee ID..: " + id);
        System.out.println("Your Salary..: " + salary);
    }
}

class Developer extends Company{
    public Developer(String name,int Salary,String id){
        this.name = name;
        this.id = id;
        this.salary = Salary;
    }
    @Override
    void calculateSalary(int amount) {
        System.out.println("Your Salary is..: " + amount);
        salary = amount;
    }
    public void dispalyDetails(){
        System.out.println("You are Developer..! ");
        System.out.println("Your name..: " + name);
        System.out.println("Your Employee ID..: " + id);
        System.out.println("Your Salary..: " + salary);
    }
}


public class Ex_13 {
    public static void main(String[] args) {
//        Employee Management System
//        Description:
//        Build a system where there is a base class Employee and subclasses like Manager, Developer.
//        Include fields like name, ID, salary, and methods like calculateSalary().
//        Concepts Covered: Inheritance, Method Overriding
        Employee ee = new Employee("Arpit Shirbhate",10000,"BCE");
        ee.calculateSalary(1000);
        ee.dispalyDetails();

        Developer de = new Developer("Vedansh",100000,"BCA");
        de.dispalyDetails();
        de.calculateSalary(10000);
    }
}
