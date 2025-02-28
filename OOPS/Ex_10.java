package OOPS;
class Details{
    private String name;
    private int members;
    private String address;

    public String getname(){
        return name;
    }
    public void setname(String names){
        name = names;
    }
    public int getmember(){
        return members;
    }
    public void setmembers(int members1){
        members = members1;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String addresss){
        address = addresss;
    }
    public void finalDetails(){
        System.out.println("Your Name..: " + name );
        System.out.println("Members in your Family..: " + members);
        System.out.println("Your Address.: " + address);
    }
}

public class Ex_10 {
    public static void main(String[] args) {
        Details family = new Details();
        family.setname("Arpit Shirbhate");
        family.setmembers(6);
        family.setAddress("At Post Dharni");
        family.finalDetails();
    }
}
