package LAB_FAT;
class Class{
    public void add(int n,int n1){
        System.out.println("Sum is..: " + (n+n1));
    }

    public void add(int n1,int n2,int n3){
        System.out.println("Sum is..: " + (n1+n2+n3));
    }
}

public class Ex_6 {
    public static void main(String[] args) {
        // Demonstrate method overloading with an add() method.
        Class sum = new Class();
        sum.add(10,20);
        sum.add(30,40,50);
    }
}
