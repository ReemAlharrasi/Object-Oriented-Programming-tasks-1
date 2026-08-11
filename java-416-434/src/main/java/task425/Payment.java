package task425;

public class Payment {
    private double amount;

    public double getAmount() {return amount;}

    public void setAmount(double amount) {
        if (amount>=0)this.amount = amount;
        else{
            System.out.println("Invalid amount");
            this.amount=0;
        }
    }
}
