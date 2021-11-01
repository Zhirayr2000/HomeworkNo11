package homework;

public class Cat extends Pet{
    private String coatColor;
    public Cat(String name,byte age,double cost,String coatColor){
        super(name,age,cost);
        this.coatColor=coatColor;
    }
    protected void speak() {
        System.out.println("Meow");
    }
    public String GetCoatColor(){
        return coatColor;
    }
}
