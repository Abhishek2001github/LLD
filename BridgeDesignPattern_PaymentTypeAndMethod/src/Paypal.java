public class Paypal implements PaymentMethod{
    @Override
    public void processPayment(String amount) {
        System.out.println("payment method is paypal of $"+amount);
    }
}
