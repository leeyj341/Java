package oop.chap07.poly;

public class ShapeTest {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[6];
		shapes[0] = new Triangle(7,5,"Blue");
		shapes[1] = new Rectangle(4,6,"Blue");
		shapes[2] = new Triangle(6,7,"Red");
		shapes[3] = new Rectangle(8,3,"Red");
		shapes[4] = new Triangle(9,8,"White");
		shapes[5] = new Rectangle(5,7,"White");
		
		System.out.println("기본정보");
		for (int i = 0; i < shapes.length; i++) {
			if(shapes[i] instanceof Rectangle) {
				System.out.print("Rectangle\t");
			}
			else {
				System.out.print("Triangle\t");
			}
			System.out.println(shapes[i].getArea() +"\t" + shapes[i].getColors());
		}
		
		System.out.println("사이즈를 변경 후 정보");
		for (int i = 0; i < shapes.length; i++) {
			if(shapes[i] instanceof Rectangle) {
				((Rectangle)shapes[i]).setResize(5);
				System.out.print("Rectangle\t");
			}
			else {
				((Triangle)shapes[i]).setResize(5);
				System.out.print("Triangle\t");
			}
			System.out.println(shapes[i].getArea() +"\t" + shapes[i].getColors());
		}

	}

}
