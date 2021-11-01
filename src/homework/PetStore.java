package homework;

import java.util.ArrayList;

public class PetStore extends Store{
    private ArrayList<Pet> pets;
    public void sellPet(Pet pet){
        if(pets.contains(pet)){
            budget+=pet.cost+pet.cost/10;
            budget+= pet.cost;
            System.out.println("Pet is successfully sold");
        }
        else
            System.out.println("There is no such pet");
    }
    public void addPet(Pet pet){
        if(budget>= pet.cost) {
            pets.add(pet);
            budget-= pet.cost;
        }
    }
    public void allPets(){
        for (Pet p:pets){
            p.description();
            System.out.println("//////////////");
        }
    }
    public PetStore(double budget,double area,Pet[] pets){
        super(budget,"Retail Store",area);
        for(Pet p:pets){
            this.pets.add(p);
        }
    }
}
