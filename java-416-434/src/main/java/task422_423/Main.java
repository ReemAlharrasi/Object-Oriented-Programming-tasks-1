package task422_423;

import java.util.ArrayList;

public class Main {
    void main(){
        //create list of animals
        ArrayList<AnimalBehaviour> animals = new ArrayList<>();

        //create dogs
        Dog puppy= new Dog();
        animals.add(puppy);

        //create cats
        Cat kitten = new Cat();
        animals.add(kitten);

        for (AnimalBehaviour animal:animals){
            animal.makeSound();
        }
    }
}
