package task426_427_428;

import java.util.ArrayList;
import java.util.List;

public class Main {

    void main(){
        List<Payment> paymentsList = new ArrayList<>();

        CashPayment cash = new CashPayment();
        paymentsList.add(cash);

        CardPayment card = new CardPayment();
        paymentsList.add(card);

        PayPalPayment paypal = new PayPalPayment();
        paymentsList.add(paypal);

        for (Payment pay: paymentsList){
            pay.process();
        }
    }
}
