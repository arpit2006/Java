package LAB_FAT;
class Student{
    String name;
    int age;
    String grade;
    int birthDate;
    public Student(String name, int age,String grade,int birthDate){
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.birthDate = birthDate;
    }

    public void Details(){
        System.out.println("Name..: " + name);
        System.out.println("Age..: " + age);
        System.out.println("Birthdate..: " + birthDate);
        System.out.println("Grade..: " + grade);
    }
}

public class Ex_4 {
    public static void main(String[] args) {
        //Create a class Student with attributes name, age, grade. Print details using objects.
        Student student = new Student("Arpit Shirbhate",19,"S",06);
        student.Details();
    }
}
