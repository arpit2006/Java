package OOPS;
class Cellphone{
    String ring;
    String vibrate;
    public void setring(){
        System.out.println("Ringing..!");
    }
    public void setvibrate(){
        System.out.println("Vibrating..! ");
    }
}

public class Ex_3 {
    public static void main(String[] args) {
        Cellphone phone = new Cellphone();

        phone.setvibrate();
        phone.setring();
    }
}
