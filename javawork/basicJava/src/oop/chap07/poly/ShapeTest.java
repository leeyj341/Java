package oop.chap07.poly;

public class ShapeTest {

	public static void main(String[] args) {
		// Shape타입의 객체를 참조할 수 있는 변수 6개를 배열로 생성
		Shape[] shapes = new Shape[7];
		shapes[0] = new Triangle(7,5,"Blue");
		shapes[1] = new Rectangle(4,6,"Blue");
		shapes[2] = new Triangle(6,7,"Red");
		shapes[3] = new Rectangle(8,3,"Red");
		shapes[4] = new Triangle(9,8,"White");
		shapes[5] = new Rectangle(5,7,"White");
		shapes[6] = new Circle(0,0,"White",5);
		
		System.out.println("기본정보");
		for (int i = 0; i < shapes.length; i++) {
			printType(shapes[i]);
			System.out.println(shapes[i].getArea() +"\t" + shapes[i].getColors());
		}
		
		System.out.println("사이즈를 변경 후 정보");
		for (int i = 0; i < shapes.length; i++) {
			if(shapes[i] instanceof Rectangle) {
				// 객체의 타입을 변경하는 경우 무조건 변경하는 것이 아니라
				// 객체의 타입을 체크한 후 변경한다.
				((Rectangle)shapes[i]).setResize(5);
				System.out.print("Rectangle\t");
			}
			else if(shapes[i] instanceof Circle) {
				((Circle)shapes[i]).setResize(5);
				System.out.print("Circle\t");
			}
			else {
				((Triangle)shapes[i]).setResize(5);
				System.out.print("Triangle\t");
			}
			System.out.println(shapes[i].getArea() +"\t" + shapes[i].getColors());
		}
		//향상된 for문 - 5.0부터 추가된 for문
		//배열이나 Collection을 다룰 때 사용
		//for문이 한 번 실행될때마다
		//shapes배열에서 요소 하나씩 꺼내서 obj에 전달 후 작업
		/*for (Shape obj : shapes) {
			if(obj instanceof Rectangle) {
				((Rectangle)obj).setResize(5);
				System.out.print("Rectangle\t");
			}
			else {
				((Triangle)obj).setResize(5);
				System.out.print("Triangle\t");
			}
			System.out.println(obj.getArea() +"\t" + obj.getColors());
			//System.out.println(obj.getColors()); //obj == shapes[i]
		}*/
		/*for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i].getClass().getName() + "\t" + 
								shapes[i].getArea() + "\t" + shapes[i].getColors());
		}*/

	}
	
	public static void printType(Shape shape) {
		if(shape instanceof Rectangle) {
			// 객체의 타입을 변경하는 경우 무조건 변경하는 것이 아니라
			// 객체의 타입을 체크한 후 변경한다.
			System.out.print("Rectangle\t");
		}
		else if(shape instanceof Circle) {
			System.out.print("Circle\t");
		}
		else {
			System.out.print("Triangle\t");
		}
	}

}
