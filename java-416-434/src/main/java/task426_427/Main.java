package task426_427;

public class Main {

    void main(){
        CashPayment cash = new CashPayment();
        cash.process();

        CardPayment card = new CardPayment();
        card.process();

        PayPalPayment paypal = new PayPalPayment();
        paypal.process();
    }
}
