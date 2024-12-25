public class Car extends Vehicle{

    public Car(){
        setMake("Toyota");
        setModel("Camry");
        setEngineType("Gasoline");
        setColor("Black");
        setWheels("Alloy");
    }

    @Override
    public void display() {
        System.out.println("Car Details: " + getMake() + " " + getModel() + " - " + getEngineType() + " - " + getColor() + " - " + getWheels());

    }
}
