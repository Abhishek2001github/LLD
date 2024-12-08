//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
ShoppingCart cart =new ShoppingCart();

cart.setPaymentStrategy(new CreditCardStrategy("123-456-789","Abhi"));
cart.checkout(200);
//cart.setPaymentStrategy(new PayPalStrategy("abhishek@gmail.com"));
        cart.checkout(500);

    }
}