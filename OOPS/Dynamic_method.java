package OOPS;
class Vehicle{
    public void bike(){
        System.out.println("I am Bike..: ");
        System.out.println("My Company is Hero...! ");
    }
    public void bike1(){
        System.out.println("I am Bike..: ");
        System.out.println("My Company is Honda...! ");
    }
}
class car extends Vehicle{
    public void Car(){
        System.out.println("I am car..: ");
        System.out.println("My Company is Hyundai...! ");
    }
    public void Car1(){
        System.out.println("I am car..: ");
        System.out.println("My Company is suzuki...! ");
    }
}

public class Dynamic_method {
    public static void main(String[] args) {
        Vehicle obj = new car();
        obj.bike();
        obj.bike1();


    }
}
