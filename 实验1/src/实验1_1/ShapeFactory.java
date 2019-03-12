package 实验1_1;

public class ShapeFactory {

	public ShapeFactory() {
		// TODO Auto-generated constructor stub
	}
	public static Shape createShape(String type) throws UnsupportedShapeException{
		if(type.equalsIgnoreCase("circle")) {
			return new Circle();
		}
		else if(type.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		else if(type.equalsIgnoreCase("triangle")) {
			return new Triangle();
		}
		else{
			throw new UnsupportedShapeException("��֧�ָ���״");
		}
	}

}
