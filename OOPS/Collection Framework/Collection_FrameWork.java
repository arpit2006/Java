package OOPS;
import java.util.ArrayList;
import java.util.Arrays;

public class Collection_FrameWork {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(0,30);
        for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }
    }
}
