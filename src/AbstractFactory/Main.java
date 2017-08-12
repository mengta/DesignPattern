package AbstractFactory;

public class Main {
    public static void main(String[] args){
        AbstractFactory shapeFactory=FactoryProducer.getFactory("shape");
        Shape shape=shapeFactory.getShape("circle");
        shape.draw();
        AbstractFactory colorFactory=FactoryProducer.getFactory("color");
        Color color=colorFactory.getColor("red");
        color.fill();
    }
}
