public class NormalPayment extends PaymentType{
    public NormalPayment(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    void makePayment(String amount) {
        System.out.println("[Normal Payment]");
        paymentMethod.processPayment(amount);
    }
}
