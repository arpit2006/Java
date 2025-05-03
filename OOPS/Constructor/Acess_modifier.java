package OOPS;
class employee{
     private String name;
    private int id;

    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }
    public int getID(){
        return id;
    }
    public void setID(int i){
        id = i;

    }

}

public class Acess_modifier {
    public static void main(String[] args) {
        employee arpit = new employee();
//        arpit.id = 247582;
//        arpit.name = "Bartls";
        // Throws an error due to private acess modifier
        arpit.setname("Arpit");
        System.out.println(arpit.getname());
    }
}
