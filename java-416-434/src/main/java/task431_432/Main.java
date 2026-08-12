package task431_432;

import java.util.ArrayList;
import java.util.List;

public class Main {
    void main() {
        List<Payment> paymentsList = new ArrayList<>();

        CashPayment cash = new CashPayment();
        paymentsList.add(cash);

        CardPayment card = new CardPayment();
        paymentsList.add(card);

        PayPalPayment paypal = new PayPalPayment();
        paymentsList.add(paypal);

        for (Payment pay : paymentsList) {
            pay.process();
        }

        //task429
        cash.accept("12");
        cash.accept((long) 12);
        cash.accept((int) 12);
    }
}
