import FactoryPattern.Shape;
import FactoryPattern.ShapeFactory;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        //Factory pattern
        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shape = shapeFactoryObj.getShape("CIRCLE");
        shape.draw();
    }
}