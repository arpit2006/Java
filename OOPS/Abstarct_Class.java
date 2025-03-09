package OOPS;
 abstract class base{
    public base(){
        System.out.println("I am Constructor..! ");
    }
    public void sayhello(){
        System.out.println("Hello..! ");
    }
    abstract public void greet();
    //if we are using abstract method then we have to make the class abstract also
}
class base1 extends base{
     @Override
     public void greet(){
         System.out.println("Good Morning..! ");
     }
}
abstract class base2 extends base{
     //now here we are inherting base class and base class is abstract so we have to make this class also abstract
     public void th(){
         System.out.println("Good Nightt");
     }
}
public class Abstarct_Class {
    public static void main(String[] args) {
        //Abstract means --> Existing in thoughts
        // Abstract in java --> A method is declared without an implementation
        //Abstract Class -->  Abstract means which contains abstract
        //At least one method will be abstract
        //We cant create object of abstract class
        base1 obj = new base1(); // --> it is working it is not a abstract class
//        base obj = new base(); // --> not posssilbe it is an abstract class

    }
}
