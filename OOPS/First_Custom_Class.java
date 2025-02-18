package OOPS;
class Employee{
    //if we add public it will show error because 1 java file can contain only one public class
    int id;
    int salary;
    String name;
    //created to directly call the function
    public void printdetail(){
        System.out.println("My Detail..: " + id);
        System.out.println("my name...: " + name);
    }
    public int getsalary(){
        return salary;
    }
}


public class First_Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class..! ");
        Employee harry = new Employee();//Initiating a new employee object
        Employee jhon = new Employee();
        //setting attributes/
        harry.id = 247582;
        harry.name = "Arpit";
        // if we want to print seprately
//        System.out.println(harry.id);
//        System.out.println(harry.name);

        // if we want to directly print
        harry.printdetail();


        jhon.id = 247589;
        jhon.name = "Harry";
        jhon.salary = 100000;
        jhon.printdetail();
        System.out.println("Salary is..: " + jhon.salary);



    }
}
