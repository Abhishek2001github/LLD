public class Main {
    public static void main(String[] args) {
    PaymentType normalcreditcardPayment= new NormalPayment(new Paypal());
    normalcreditcardPayment.makePayment("100");
    }
}
/*
 Bridge Pattern is a structural design pattern that decouples an abstraction from its implementation
 when to use to Bridge Design Pattern
 if you have two independent hierarchies that need to vary independently (like there are two paymentmethod and paymenttype
 If you need a scalable and extensible system where new changes should be added without modifying existing code, then Bridge Pattern is a great choice
* */