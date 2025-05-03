package OOPS;
import java.util.Scanner;
abstract class Vehiclee {
    protected String brand;
    protected String model;
    protected double rentalPrice;


    public Vehiclee(String brand, String model, double rentalPrice) {
        brand = brand;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    public abstract double calculateRental(int days);

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rental Price per Day: " + rentalPrice);
    }
}

class Car extends Vehiclee {
    private double insuranceFee;

    public Car(String brand, String model, double rentalPrice, double insuranceFee) {
        super(brand, model, rentalPrice);
        this.insuranceFee = insuranceFee;
    }
    public void start(){
        System.out.println("Hey");
    }
    @Override
    public double calculateRental(int days) {
        return (rentalPrice * days) + insuranceFee;
    }
}

class Bike extends Vehiclee {
    private double helmetFee;

    public Bike(String brand, String model, double rentalPrice, double helmetFee) {
        super(brand, model, rentalPrice);
        this.helmetFee = helmetFee;
    }
    @Override
    public double calculateRental(int days) {
        return (rentalPrice * days) + helmetFee;
    }
}



public class qq {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        Car car = new Car("Toyota", "Camry", 50, 20);
        Bike bike = new Bike("Yamaha", "R15", 20, 5);

        car.displayInfo();
        System.out.println("Total Rental Cost for 3 days: " + car.calculateRental(3));

        car.start();
        System.out.println();

        bike.displayInfo();
        System.out.println("Total Rental Cost for 3 days: " + bike.calculateRental(3));





        scanner.close();
            }
        }



