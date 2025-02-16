public class CreditCard implements PaymentMethod{
    @Override
    public void processPayment(String amount) {
        System.out.println("payment method is credit card of $"+amount);
    }
}
