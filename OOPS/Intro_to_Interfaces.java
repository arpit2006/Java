package OOPS;
interface Bicycle{
    //interface is group of methods which we have to compulsay implement
    //if you are using bicycle use thier methods also
    int a = 45;
    void appltBrake(int decrement);
    void speedup(int increment);
}
interface horn{
    void sound_horn();
    void blow_horn();
}
class avoncycle implements Bicycle,horn{
    //Now we have to use bicycle methods also
    //while implementing we have to use public

    @Override
    public void appltBrake(int decrement) {
        System.out.println("Applying Brake");
    }

    @Override
    public void speedup(int increment) {
        System.out.println("Speeding up");
    }

    @Override
    public void blow_horn() {
        System.out.println("Blowing Horn...! ");
    }

    @Override
    public void sound_horn() {
        System.out.println("Sound od Horn..! ");
    }
}
public class Intro_to_Interfaces {
    public static void main(String[] args) {
        //Interfaces --> Interface is a group of related method
        //Object of interfences cannot be created
        avoncycle obj = new avoncycle();
        obj.appltBrake(3);
        System.out.println(obj.a); // you can create property in interfaces
        //you cannot  modify the properties in interfaces
        obj.blow_horn();
        obj.sound_horn();
    }
}
