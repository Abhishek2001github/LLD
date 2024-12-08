public class BitCoinStrategy implements PaymentStrategy{
    private String bitcoinAddress;
    // Concrete Strategy for Bitcoin payment
public BitCoinStrategy(String bitcoinAddress) {
    this.bitcoinAddress=bitcoinAddress;

}
@Override
    public void pay(int amount){
    System.out.println("Paid"+amount+"using bitcoin");
}
}
