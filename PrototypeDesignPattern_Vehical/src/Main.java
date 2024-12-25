import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Vehicle carPrototype=new Car();
        Vehicle customizedCar=carPrototype.clone();
        customizedCar.setColor("pink");
        customizedCar.setEngineType("EV");
        customizedCar.display();
    }
}
//define
//Prototype desing pattern
//it is a creational design pattern use when object creation is expensive need a lot of operation
//insted of creating object form scratch it just clone the existing object and user can customized it
//Usecase of prototypeDesign Pattern
//When the cost of creating a new object is high.
//When you need to create many identical objects with slight variations.
//When objects have complex structures that need to be cloned and adjusted.

//Reallife Secnarios
//In applications like Photoshop or other graphic design software, the Prototype pattern is commonly used for objects like shapes, drawings, and layers.
//When a user creates a shape or drawing, the object can be cloned (copied)
//when similar objects need to be created,avoiding the need to redefine
//\the entire shape from scratch