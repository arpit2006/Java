package OOPS;

import java.util.*;

public class Linked_List {
    public static void main(String[] args) {
        //All methods are same as arrayList in linked list.
        //Some methods are still different.

        LinkedList <Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(690); //This is not in arraylist
        list.addLast(120); //This is not in arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
