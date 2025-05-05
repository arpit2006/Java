package LAB_FAT;
class Animal{
   String name;
   public void eat(){
       System.out.println(name +" Eating..! ");
   }
   public void sleep(){
       System.out.println(name + " Sleeping..! ");

   }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println(name + " Eating..!");
    }

    @Override
    public void sleep() {
        System.out.println(name + " Sleeping..! ");
        System.out.println();
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println(name + " Eating..!");
    }

    @Override
    public void sleep() {
        System.out.println(name + " Sleeping..! ");
    }
}
public class Ex_7 {
    public static void main(String[] args) {
       //Create Animal as base class, and Dog, Cat as subclasses (inheritance).
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.eat();
        dog.sleep();

        Cat cat = new Cat();
        cat.name = "Hunny";
        cat.eat();
        cat.sleep();

    }
}
