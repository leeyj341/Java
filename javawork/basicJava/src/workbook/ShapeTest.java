package workbook;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shape = new Shape[4];
		shape[0] = new Rectangle(4,7,5);
		shape[1] = new Rectangle(5,4,6);
		shape[2] = new Circle(6,6,7);
		shape[3] = new Circle(7,8,3);

		print(shape);
		
		System.out.println("After Move ...........");
		for (Shape obj : shape) {
			if(obj instanceof Rectangle) {
				((Rectangle)obj).move(10, 10);
			}
			else {
				((Circle)obj).move(10, 10);
			}
		}
		print(shape);
		
	}
	public static void print(Shape[] shape) {
		for (Shape obj : shape) {
			if(obj instanceof Rectangle) {
				System.out.println(((Rectangle)obj).printInfo());
			}
			else {
				System.out.println(((Circle)obj).printInfo());
			}
		}
	}

}
