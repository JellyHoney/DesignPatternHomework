public class ShapeFactory {
    public static Shape createShape(String type) throws UnsupportedShapeException {
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (type.equalsIgnoreCase("triangle")) {
            return new Triangle();
        } else {
            throw new UnsupportedShapeException("unsupported shape");
        }
    }

}
