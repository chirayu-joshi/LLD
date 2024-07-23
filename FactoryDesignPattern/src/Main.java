import factory_pattern.Shape;
import factory_pattern.ShapeFactory;
import factory_pattern.Shapes;

public class Main {
    public static void main(String[] args) {
        Shape circleObject = ShapeFactory.getShape(Shapes.CIRCLE);
        circleObject.draw();
    }
}
