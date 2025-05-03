package OOPS;
interface Camera{
    void takeSnap();
    void recordVide();
    default void  record4KVideo(){
        System.out.println("Hello");
        //By using void we have to not implement this method in the main class we can leve it
        //we can override it in main class so it will run not the original method
    }

}
interface Wifi{
    String [] getNetWorks();
    void connecttoNetwork(String network);

}
class MycellPhone{
    void callNumbers(int phno){
        System.out.println("Calling..! " + phno);
    }

    void pickCall(){
        System.out.println("Connecting..! ");
    }

}

class Smartphone extends MycellPhone implements Wifi,Camera{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVide(){
        System.out.println("Video..! ");
    }

    @Override
    public String[] getNetWorks() {
        return new String[0];
    }

    @Override
    public void connecttoNetwork(String network) {
        System.out.println("HWY");
    }

}

public class Default_methods {
    public static void main(String[] args) {
        System.out.println("Default Methods..! ");

        Smartphone ms = new Smartphone();
        ms.record4KVideo();
        ms.connecttoNetwork("Hello");
    }
}
