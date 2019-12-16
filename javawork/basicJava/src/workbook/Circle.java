package workbook;

public class Circle extends Shape implements Movable {
	private int radius;
	
	public Circle() {
	}
	public Circle(int radius, int x, int y) {
		super(new Point(x,y));
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void move(int x, int y) {
		point.x += x + 1;
		point.y += y + 1;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}

	public String printInfo() {
		return "Circle:\t" + radius + "\t" + point.x + "\t" + point.y;
	}
	
	

}
