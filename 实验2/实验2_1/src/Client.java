public class Client {

	static void test(String x) {
	}
	public static void main(String[] args) {
		try {
			Shape shape=ShapeFactory.createShape(XMLUtilShape.getShapeType());
			shape.draw();
			shape.erase();
		}
		catch (UnsupportedShapeException e) {
			System.out.println(e.getMessage());
		}
	}

}
