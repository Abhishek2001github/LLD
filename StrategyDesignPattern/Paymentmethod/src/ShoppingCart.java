public class ShoppingCart { // Context Class


    private PaymentStrategy paymentStrategy;
    // Set the strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void checkout(int amount){
        paymentStrategy.pay(amount);
    }
}
