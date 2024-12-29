//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Mushroom(new ExtraCheese(new VegDelight()));
        System.out.println(pizza.cost());
    }
}

/*
The Decorator Design Pattern allows you to dynamically add functionality to an object at runtime without altering its structure.
It is often used to adhere to the Open/Closed Principle — classes should be open for extension but closed for modification.*/
