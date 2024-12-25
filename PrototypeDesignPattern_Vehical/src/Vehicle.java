import java.util.SplittableRandom;

public abstract class Vehicle implements Cloneable{
    private String make;
    private String model;
    private String engineType;
    private String color;
    private String wheels;

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    // Optional Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getColor() {
        return color;
    }

    public String getWheels() {
        return wheels;
    }

    public abstract void display();
    // Cloning method (Prototype)
    @Override
    public Vehicle clone() throws CloneNotSupportedException{
        return (Vehicle) super.clone();

    }


}
