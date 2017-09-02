package liskovsubstitution;

public class Square implements Shape {
	private int width;

	@Override
	public int getSquare() {
		return width * width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
