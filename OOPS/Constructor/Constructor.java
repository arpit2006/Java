package OOPS;
//Constructor in java is a member function used to initialize an object while creating it.
class MyEmployee{
    private int id;
    private String name;
//    public MyEmployee(){
////  Constructor is automatically invoked
////  As its name is same as class so it is automatically runned
//        id = 247531;
//        name = "Batla Srivastava";
//    }

    public MyEmployee(String myname,int myid){
// We can pass arguments in constructors
        //Constructors can be overloaded
       name = myname;
       id = myid;
    }

    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int n){
        id = n;
    }

}
public class Constructor {
    public static void main(String[] args) {
        //If no arguments is passed in object so it will run its main class
        MyEmployee details = new MyEmployee("Sumedh",247071);
//        details.setname("Arpit Shirbhate");
//        details.setId(247582);
        System.out.println(details.getname());
        System.out.println(details.getId());

    }
}
