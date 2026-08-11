package task422;

public class Dog implements AnimalBehaviour{
    @Override
    public void eat() {
        System.out.println("The dog eats");
    }

    @Override
    public void sleep() {
        System.out.println("The dog sleeps");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }
}
