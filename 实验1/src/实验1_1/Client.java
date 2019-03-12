package 实验1_1;

public class Client {

	static void test(String x) {
		try {
			Shape shape=ShapeFactory.createShape(x);
			shape.draw();
			shape.erase();
		}
		catch (UnsupportedShapeException e) {
			System.out.println("unsupported shape");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test("circle");
		test("rectangle");
		test("triangle");
		test("xxx");
	}

}
