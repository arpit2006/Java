package Methods_Practice;
class animals{
    public void sound(){
        System.out.println("Hey I am Animal Class..! ");
    }
}
class dog extends animals{
    public void dog(){
        System.out.println("Barking");
    }
}

public class Ex_7 {
    public static void main(String[] args) {
        dog obj = new dog();
        obj.dog();
    }
}
