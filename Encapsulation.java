package projects.Basic;

public class Encapsulation {
    public static void main(String args[]){
        Encapsulation en = new Encapsulation();
        en.getInfo();
    }

    public void getInfo(){
        Human man = new Human();
        man.setAge(27);
        man.setName("Charles");
        man.getName();
        man.getAge();
        System.out.println("Name : "+man.getName()+" age: "+man.getAge());
    }
}

class Human{
    private int age;
    private String name;
    public int getAge(){
        return age;
    };
    public String getName(){
        return name;
    };
    public void setName(String n){
        name = n;
    };
    public void setAge(int a){
        age = a;
    }
}