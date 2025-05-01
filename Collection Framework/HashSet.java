package OOPS;
import java.util.*;

public class HashSet {
    public static void main(String[] args) {
        System.out.println("HashSet in Collection Framework in java");
        //HashSet is collection of unique item
        //Repetition are not allowed
        java.util.HashSet<Integer> name = new java.util.HashSet<>();

       //java.util.HashSet<Integer> name1 = new java.util.HashSet<>(10,0.5f);
        //You can change initial capacity and loadFactor in hashset by giving parameters.
        name.add(10);
        name.add(20);
        name.add(30);
        name.add(40);
        name.add(50);
        //It will directly print it to console
        //If you sre using any method related to hashing then you can save time while writing program
        //It has multiple method check it here(https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html)
        System.out.println(name);
    }
}
