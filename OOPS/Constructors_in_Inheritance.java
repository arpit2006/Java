package OOPS;
class New{
    New(){
        System.out.println("Hey I am a Constructor");
    }

    New(int num){
        System.out.println("Hey I am a Constructor with some value..: " + num);
    }
}
// If we did not create a constructor in derived class it will invoke the base class constructor
class New1 extends New{
    New1(){
        super(0);
        //Now it will run the paramter construcutor
        System.out.println("Hey I am Derived Class Constructor");
    }
    New1(int x , int y){
        super(x);
        //it will go up and give value 14 to it
        System.out.println("Heyy I am Preloaded Constructor..: " + (x + y));
    }
}

public class Constructors_in_Inheritance {
    public static void main(String[] args) {
//        New obj = new New();
        // When we are running the code it will execute the first constructor
        New1 ob1 = new New1(14,6);
    }
}
