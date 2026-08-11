package task418_419_420;

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

        //task420
        System.out.print("did you attend the session? ");
        String answer =sc.nextLine().strip().toLowerCase();
        if (answer=="yes") System.out.println("used ==");
        if (answer.equals("yes")) System.out.println("used equals()");

        //close scanner
        sc.close();
    }
}
