package edu.jalc.inclass.animal;

import java.util.ArrayList;

public class AnimalDriver{

  public static void animalSays(ArrayList<Animal> animal){
    System.out.println(animal);
  }

  public static void main(String[] args){
  
    ArrayList<Animal> animals = new ArrayList<>();
    
    animals.add(new Dog("bark","growl","whimper"));
    animals.add(new Cat("meow","purr","growl"));

    for(Animal animal : animals){
       AnimalDriver.animalSays(animals);
    }
  }
}
