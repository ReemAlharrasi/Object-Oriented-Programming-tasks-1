package task424;

public class Main {

    void main(){
        Dog dog = new Dog();
        dog.setAge(5);
        System.out.println("Entered 5: "+dog.getAge());
        dog.setAge(-1);
        System.out.println("Entered -1: "+dog.getAge());
    }
}
