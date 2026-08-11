package task418_419;

import java.util.Scanner;

public class Main {
    //initialize scanner
    Scanner sc =new Scanner(System.in);

    void main(){
        //task418
        Car car = new Car();
        car.colour="white";
        car.plate="3119RS";
        car.drive();
        car.brake();

        //task 419
        Car toyota = new Car();
        System.out.print("Enter car colour: ");
        toyota.colour=sc.nextLine().strip();
        System.out.print("Enter plate: ");
        toyota.plate=sc.nextLine().strip();
        toyota.drive();

        //close scanner
        sc.close();
    }
}
