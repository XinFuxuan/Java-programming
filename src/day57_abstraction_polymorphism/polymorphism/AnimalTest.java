package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a1 = new Animal(); // not polymorphic, data type and object type are the same
        a1.makeNoise();

        //PArent type = new Child Type
        Animal animal1 = new Dog(); //Polymorphic Way
        Animal animal2 = new Horse();
        Animal cat = new Cat();

        animal1.makeNoise();
        animal2.makeNoise();
        cat.makeNoise();

        List<Animal> listOfAnimals = new ArrayList<>(); // polymorphic list of objects
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Cat());

        for (Animal each: listOfAnimals) {
            each.makeNoise();

        }





    }
}
