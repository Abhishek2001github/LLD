public class SubscriptionPayment extends PaymentType{

    public SubscriptionPayment(PaymentMethod paymentMethod) {
        super(paymentMethod);
    }

    @Override
    void makePayment(String amount) {
        System.out.println("[Subscription Payment]");
        paymentMethod.processPayment(amount);
    }
}
