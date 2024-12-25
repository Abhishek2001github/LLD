public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape1=shapeFactory.getShape("Circle");
        shape1.draw();
        Shape shape2=shapeFactory.getShape("Rectangle");
        shape2.draw();
        Shape shape3=shapeFactory.getShape("Square");
        shape3.draw();

    }
}

//---------application of FactoryDesign Pattern---------------

//When the system needs to be independent of how its objects are created.
//When the system should allow for the addition of new object types without affecting the existing code.


//Example -
//1.  Factory Design Pattern can be applied to create database connections for different database types (like MySQL, Oracle, or PostgreSQL)
//2.  Document Creation: You might have a Document interface and different types of documents (e.g., PDFDocument, WordDocument, etc.). The factory pattern can be used to create the appropriate document type based on input