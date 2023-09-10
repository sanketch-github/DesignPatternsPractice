package creational_design_pattern.factory_pattern;

/**
 * In Factory pattern, we create object without exposing the creation logic to the client and refer to newly
 * created object using a common interface.
 */

interface Shape{
     public String draw();
}

class Rectangle implements Shape {

    @Override
    public String draw() {
        return "Rectangle";
    }
}

class Square implements Shape {

    @Override
    public String draw() {
        return "Square";
    }
}

class Circle implements Shape {

    @Override
    public String draw() {
        return "Circle";
    }
}

class ShapeFactory {

    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }
}

public class FactoryPattern {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        System.out.println(shape1.draw());

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        System.out.println(shape2.draw());

        Shape shape3 = shapeFactory.getShape("SQUARE");
        System.out.println(shape3.draw());
    }
}
