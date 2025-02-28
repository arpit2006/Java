package OOPS;
class Degree{
    int year;
    int styear;
    String name;
    String Course;
    public int getyear(){
        return styear;
    }
    public void setyear(int n){
        styear = n;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int num){
        year = num;
    }
    public String setName(){
        return name;
    }
    public void setName(String names){
        name = names;
    }
    public String getCourse(){
        return Course;
    }
    public void setCourse(String sub){
        Course = sub;
    }

    public void GraduationDeatils(){
        System.out.println("Your name..: " + name);
        System.out.println("Your Course Name...: " + Course);
        System.out.println("Your Enrollment Year..: " + styear);
        System.out.println("Your Graduation Year..: " + year);
    }
}

public class Ex_11 {
    public static void main(String[] args) {
        Degree details = new Degree();
        details.setName("Arpit Shirbhate");
        details.setCourse("Computer Science and Engineering");
        details.setyear(2024);
        details.setYear(2028);
        details.GraduationDeatils();
    }
}
