package workbook;

public class Rectangle extends Shape implements Movable {
	private int width;
	
	public Rectangle() {
	}
	public Rectangle(int width, int x, int y) {
		super(new Point(x,y));
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	public void move(int x, int y) {
		point.x += x + 2;
		point.y += y + 2;
	}

	@Override
	public double getArea() {
		return width * width;
	}

	@Override
	public double getCircumference() {
		return width * 4;
	}
	
	public String printInfo() {
		return "Rectangle:\t" + width + "\t" + point.x + "\t" + point.y;
	}
}
