package LAB_FAT;
import java.util.Scanner;
class Car{
    String name;
    public Car(String name){
        this.name = name;
    }

    public void start(){
        System.out.println(name + " Starting..! ");
    }
    public void stop(){
        System.out.println(name + " Stopping..!");
    }
}

public class Ex_5 {
    public static void main(String[] args) {
        //Write a Car class with constructor, methods start(), stop().
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Car Brand..: ");
        String name = input.nextLine();

        Car car = new Car(name);
        car.start();
        car.stop();
    }
}
