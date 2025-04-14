package OOPS_Practice;
abstract class Vehicle{
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle{

    public void Name(){
        System.out.println("This is a Car Class Inherited from Vehicles..!  ");
    }
    @Override
    public void startEngine() {
        System.out.println("Starting i20...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Turning off i20...");
        System.out.println();

    }
}

class Bike extends Vehicle{

    public void Name(){
        System.out.println("This is a Bike Class Inherited from Vehicles..!  ");
    }
    @Override
    public void startEngine() {
        System.out.println("Starting Activa...");
    }
    @Override
    public void stopEngine() {
        System.out.println("Turning off Activa...");
        System.out.println();

    }
}

class Truck extends Vehicle{
    public void Name(){
        System.out.println("This is a Truck Class Inherited from Vehicles..!  ");
    }
    @Override
    public void startEngine() {
        System.out.println("Starting Tata...");

    }

    @Override
    public void stopEngine() {
        System.out.println("Turning off Tata...");
        System.out.println();

    }
}

public class Ex_2 {
//    Q: You're building a Vehicle Management System. There are different types of vehicles like Car, Bike, and Truck.
//            👉 Create an abstract class called Vehicle with two abstract methods:
//    startEngine()
//    stopEngine()
//
//    Then create subclasses like Car, Bike, and Truck that inherit from Vehicle and implement these methods in their own way.
//    Use this to show how abstraction and inheritance work together.

    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Truck truck = new Truck();

        car.Name();
        car.startEngine();
        car.stopEngine();

        bike.Name();
        bike.startEngine();
        bike.stopEngine();

        truck.Name();
        truck.startEngine();
        truck.stopEngine();
    }
}
