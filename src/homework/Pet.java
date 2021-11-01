package homework;

public class Pet {
    protected String name;
    protected byte age;
    protected double cost;
    protected Pet(String name,byte age,double cost){
        this.name=name;
        this.age=age;
        this.cost=cost;
    }
    protected void speak(){
        System.out.println("Pet is speaking");
    }
    protected void description(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nCost: "+cost);
    }
}
