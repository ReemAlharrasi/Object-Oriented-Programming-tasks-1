package task418_419_420;

public class Car {
    String colour;
    String plate;

    //method
    public void drive() {
        System.out.println(this.colour + " " + this.plate + " car has moved!");
    }

    public void brake() {
        System.out.println(this.colour + " " + this.plate + " car has stopped!");
    }
}
