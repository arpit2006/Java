package OOPS;
interface calculateMark{
    void final_mark(int marks);
}
class CAT implements calculateMark{

    @Override
    public void final_mark(int marks) {
        float scored_mark = (marks / 50f) * 100;
        float scored_mark_1 = scored_mark * 15 / 100;
        System.out.println(scored_mark_1);
    }}

class FAT implements calculateMark{

    @Override
    public void final_mark(int marks) {
        float scored_mark = (marks / 50f) * 100;
        float scored_mark_1 = scored_mark * 15 / 100;
        System.out.println(scored_mark_1);
    }}

public class Interface_Class_1 {
    public static void main(String[] args) {
        CAT sc = new CAT();
        FAT sc1 = new FAT();
        sc.final_mark(40);
        sc1.final_mark(89);


    }
}
