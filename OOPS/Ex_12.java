package OOPS;
class Animals {
    private String Gender;
    private int age;

    public String getGender() {
        return Gender;
    }

    public void setGender(String input) {
        Gender = input;
    }

    public int getage() {
        return age;
    }

    public void setage(int num) {
        age = num;
    }
}

    class Dog extends Animals{
         private String gender;
         private int year;

         public String getGen(){
             return gender;
         }
         public void setGen(String gn){
             gender = gn;
        }

        public int getag(){
             return year;
        }
        public void setag(int y){
             year = y;
        }
    }


public class Ex_12 {
    public static void main(String[] args) {
        Animals details = new Animals();
        Dog input = new Dog();
        details.setGender("Male");
        details.setage(50);
        System.out.println(details.getGender());
        System.out.println(details.getage());

        input.setGen("Female");
        input.setag(55);
        System.out.println(input.getGen());
        System.out.println(input.getag());


    }
}
