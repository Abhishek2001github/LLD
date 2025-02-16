public abstract class PaymentType {
    protected  PaymentMethod paymentMethod;
    public PaymentType(PaymentMethod paymentMethod){
        this.paymentMethod=paymentMethod;
    }
    abstract void makePayment(String amount);
}
