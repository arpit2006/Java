public class Temp {
    static int temp(int celcius){
        if (celcius == 0){
            return 32;
        }
        else{
            return (celcius * 9/5) + 32;
        }
    }
    public static void main(String[] args) {
        System.out.println("Tempreture in Fahrenheit is..: " + temp(35));
        
    }
    
}
