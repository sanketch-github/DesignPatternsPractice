package creational_design_pattern.abstract_factory_pattern;

interface Shape{
    public String draw();
}

class Rectangle implements Shape {

    @Override
    public String draw() {
        return "Rectangle";
    }
}

class RoundedRectangle implements Shape {

    @Override
    public String draw() {
        return "RoundedRectangle";
    }
}

class RoundedSquare implements Shape {

    @Override
    public String draw() {
        return "RoundedSquare";
    }
}

class Square implements Shape {

    @Override
    public String draw() {
        return "Square";
    }
}

abstract class AbstractFactory {
    abstract Shape getShape(String shapeType) ;
}

class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}

class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}

class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }else{
            return new ShapeFactory();
        }
    }
}


public class AbstractFactoryPattern {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        System.out.println(shape1.draw());

        Shape shape2 = shapeFactory.getShape("SQUARE");
        System.out.println(shape2.draw());

        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        System.out.println(shape3.draw());

        Shape shape4 = shapeFactory1.getShape("SQUARE");
        System.out.println(shape4.draw());

    }
}
