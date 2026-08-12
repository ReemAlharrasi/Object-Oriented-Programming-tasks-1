package task426_427_428;

public class CashPayment extends Payment{

    public void accept(String cashamount){
        System.out.println("accpted cash");
    }
    public void accept(long chequeNumber){
        System.out.println("accpted cheque");
    }
    public void accept(int payOrder){
        System.out.println("accpted pay order");
    }
}
