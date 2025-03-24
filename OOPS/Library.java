package OOPS;
import java.util.Scanner;
class Library_1 {
//    Scanner input = new Scanner(System.in);
    String addbook;

    public String getAddbook() {
        return addbook;
    }

    public void setAddbook(String adddbook) {
        addbook = adddbook;
    }

    String returbook;

    public String getreturbook() {
        return returbook;
    }

    public void setreturbook(String Returbook) {
        returbook = Returbook;
    }

    // public void avaible_book() {
    //     String[] avaible_book = {"Harry Potter", "Atomis Habit", "Will", "Money"};
    //     for (int i = 0; i < avaible_book.length; i++) {
    //         System.out.println("Avaible Books are..: ");
    //         System.out.println(avaible_book[i]);
    //     }
    // }
    //         public void rtr(){

    //     System.out.println("Enter a Number");
    //     int size = input.nextInt();
    //     String[] issued_book = new String[size];
    //     for (int j = 0; j < size; j++) {
    //         System.out.println("Enter Issued Book..: ");
    //         issued_book[j] = input.next();
    //     }

    //     for (int k = 0; k < issued_book.length; k++) {
    //         System.out.println("Isued Books..: ");
    //         System.out.println(issued_book[k]);
    //     }
    //         }


    }


    public class Library {
        //    YOU have to implement a library using Java Class Library
//    Methods: addBook, issueBook, returnBook, showAvaitabteBooks
//    Properties: Array to store the available books,
//    Array to store the issued books
        public static void main(String[] args) {
            Library_1 obj = new Library_1();
            obj.setAddbook("Arpit");
            obj.setreturbook("Shirbhate");
            System.out.println(obj.getreturbook());
            System.out.println(obj.getAddbook());
//    obj.avaible_book();

        }

}
