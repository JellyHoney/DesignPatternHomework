public class Client {
    static void test(String x) {
        try {
            Shape shape = ShapeFactory.createShape(x);
            shape.draw();
            shape.erase();
        } catch (UnsupportedShapeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        test("circle");
        test("rectangle");
        test("triangle");
        test("xxx");
    }
}
