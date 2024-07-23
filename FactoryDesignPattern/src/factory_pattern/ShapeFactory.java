package factory_pattern;

public class ShapeFactory {
    public static Shape getShape(Shapes inputShape) {
        return switch (inputShape) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
        };
    }
}
