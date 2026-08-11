package task425;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    void main(){
        Payment pay = new Payment();
        pay.setAmount(-1);
        pay.setAmount(100);
        //close scanner
        sc.close();
    }
}
