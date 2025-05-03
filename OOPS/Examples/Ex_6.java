package OOPS;
class Table{
    int n;
    public void table(){
        for (int i = 1;i <=10;i++){
            if(n == 0){
                System.out.println(0);
            }
            else {
            System.out.println(n + " x " + i + " = " + (n*i));
            }
        }
    }
}

public class Ex_6 {
    public static void main(String[] args) {
        Table num = new Table();
        num.n = 10;
        num.table();
    }
}
