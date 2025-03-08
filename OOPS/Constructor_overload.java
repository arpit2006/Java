package OOPS;
//Overloading a constructor with salary
class newEmployee{
    private int salary;
    public int getsalary(){
        return salary;
    }
    public void setSalary(int num){
        salary = num;
    }
    public newEmployee(){
        salary = 1000000;
    }

}

public class Constructor_overload {
    public static void main(String[] args) {
        newEmployee details = new newEmployee();
//        details.setSalary(200000);
        System.out.println(details.getsalary());
    }
}
