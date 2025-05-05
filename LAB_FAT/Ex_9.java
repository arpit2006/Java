package LAB_FAT;
interface Bike{
    public void start();
    public void stop();
}
class Honda implements Bike{
    String name;

    @Override
    public void start() {
        System.out.println("Starting Honda..: " + name);
    }

    @Override
    public void stop() {
        System.out.println("Stopping Honda..: " + name);
        System.out.println();
    }
}
class Hero implements Bike{
    String name;

    @Override
    public void start() {
        System.out.println("Starting Hero..: " + name);
    }

    @Override
    public void stop() {
        System.out.println("Stopping Hero..: " + name);
    }
}
public class Ex_9 {
    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.name = "Activa";
        honda.start();
        honda.stop();

        Hero hero = new Hero();
        hero.name = "Destiny";
        hero.start();
        hero.stop();
    }
}
