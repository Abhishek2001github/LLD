public class UPI implements  PaymentMethod{
    @Override
    public void processPayment(String amount) {
        System.out.println("payment method is UPI of $"+amount);
    }
}
