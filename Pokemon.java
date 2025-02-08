public class Pokemon{
    String name;
    String type;
    int age;
    double hp;
 
    public void whoAreYou(){
       System.out.println("This is"+ this.name);
       System.out.println("I am " + this.name + ", a " + this.type + " type Pokémon.");
    }

    public Pokemon(String name, String type, int age, double hp){
        this.name = name;
        this.type = type;
        this.age = age;
        this.hp = hp;
    }
}

