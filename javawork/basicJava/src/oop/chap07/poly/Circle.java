package oop.chap07.poly;

public class Circle extends Shape implements Resize {
	private int radius;
	
	public Circle() {
		
	}
	public Circle(int width, int height, String colors, int radius) {
		super(width, height, colors);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void setResize(int size) {
		setRadius(radius + size);
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

}
