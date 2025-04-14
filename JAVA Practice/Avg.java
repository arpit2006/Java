import java.util.*;
public class Avg {
    static int avg(int m1,int m2,int m3,int no){
        int avgerage = (m1+m2+m3) / no;
        return avgerage;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter Marks of Three Subject..: ");

        System.out.println("Enter Marks of Subject 1..: ");
        int m1 = input.nextInt();
        
        System.out.println("Enter Marks of Subject 2..: ");
        int m2 = input.nextInt();
        
        System.out.println("Enter Marks of Subject 3..: ");
        int m3 = input.nextInt();
        
        System.out.println("Enter Number of Subject..: ");
        int no = input.nextInt();
        

        System.out.println("Average of three numbers is: " + avg(m1,m2,m3,no));
        input.close();
    }
}
