package oop.chap07.poly;

public class ShapeTest {

	public static void main(String[] args) {
		// ShapeŸ���� ��ü�� ������ �� �ִ� ���� 6���� �迭�� ����
		Shape[] shapes = new Shape[7];
		shapes[0] = new Triangle(7,5,"Blue");
		shapes[1] = new Rectangle(4,6,"Blue");
		shapes[2] = new Triangle(6,7,"Red");
		shapes[3] = new Rectangle(8,3,"Red");
		shapes[4] = new Triangle(9,8,"White");
		shapes[5] = new Rectangle(5,7,"White");
		shapes[6] = new Circle(0,0,"White",5);
		
		System.out.println("�⺻����");
		for (int i = 0; i < shapes.length; i++) {
			printType(shapes[i]);
			System.out.println(shapes[i].getArea() +"\t" + shapes[i].getColors());
		}
		
		System.out.println("����� ���� �� ����");
		for (int i = 0; i < shapes.length; i++) {
			if(shapes[i] instanceof Rectangle) {
				// ��ü�� Ÿ���� �����ϴ� ��� ������ �����ϴ� ���� �ƴ϶�
				// ��ü�� Ÿ���� üũ�� �� �����Ѵ�.
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
		//���� for�� - 5.0���� �߰��� for��
		//�迭�̳� Collection�� �ٷ� �� ���
		//for���� �� �� ����ɶ�����
		//shapes�迭���� ��� �ϳ��� ������ obj�� ���� �� �۾�
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
			// ��ü�� Ÿ���� �����ϴ� ��� ������ �����ϴ� ���� �ƴ϶�
			// ��ü�� Ÿ���� üũ�� �� �����Ѵ�.
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
