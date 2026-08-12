package task431_432;

public class PayPalPayment extends Payment {
    @Override
    public void process(){
        System.out.println("Processing from PayPal. . .");
    }
}