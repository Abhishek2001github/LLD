public class PaymentService {
    public boolean processPayment(String accountID,double amount){
        System.out.println("processed payment of $"+amount+"for account "+accountID);
        return true;
    }
}
