package homework;

public class Dog extends Pet{
    private double weight;
    public Dog(String name,byte age,float weight,double cost){
        super(name,age,cost);
        this.weight=weight;
    }
}
