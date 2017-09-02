package liskovsubstitution;

public class Main {
	
	static Rectangle getRectangle() {
		return new Rectangle();
	}
	
	public static void main(String[] args) {
		Rectangle rectangle = getRectangle();
		rectangle.setHeight(5);
		rectangle.setWidth(10);
		System.out.println(rectangle.getSquare());
	}
}
