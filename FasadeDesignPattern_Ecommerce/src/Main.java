public class Main {
    public static void main(String[] args){
        EcommerceFascasde ecommerceFascasde=new EcommerceFascasde();
        String accountID="abhi123";
        String Address="Varanasi";
        Double amount=276.90;
        String productID="PRD456";
        ecommerceFascasde.placeOrder(productID,Address,amount,accountID);

    }
}

/*
The Facade Design Pattern is a structural design pattern that provides a simplified interface to a complex subsystem.
It hides the complexities of the subsystem and provides a unified interface for the client to interact with.

KEY POINTS

Facade defines a new interface for existing objects, whereas Adapter tries to make the existing interface usable.
 Adapter usually wraps just one object, while Facade works with an entire subsystem of objects.


Abstract Factory can serve as an alternative to Facade when you only want to hide the way the subsystem objects are created from the client code.

Flyweight shows how to make lots of little objects, whereas Facade shows how to make a single object that represents an entire subsystem

*/
