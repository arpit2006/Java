import java.util.Scanner;
public class Example_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter URL..: ");
        String url = input.nextLine();
        if(url.endsWith(".com")){
            System.out.println("Commercial..! ");
        }
        else if(url.endsWith(".org")){
            System.out.println("Organisational..! ");
        }
        else{
            System.out.println("Personal..! ");
        }
    }
}
