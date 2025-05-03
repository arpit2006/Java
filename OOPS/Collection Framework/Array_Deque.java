package OOPS;
import java.util.*;
public class Array_Deque {
    public static void main(String[] args) {
        System.out.println("Arrays Deque in Collection Framework in java");
         ArrayDeque <Integer> list = new ArrayDeque<>();
         //ArrayDeque implements deque interface in java
        // ArrayDeque Constructs an empty array deque with an initial capacity sufficient to hold 16 elements,
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(69); //Same as collection framework
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }

}
