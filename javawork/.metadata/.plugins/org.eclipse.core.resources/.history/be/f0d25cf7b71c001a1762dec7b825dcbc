package oop.chap07;
/*
 * <상속관계에서 메서드가 갖는 특징
 * 1. 상속관계에서는 상위클래스에 정의된 메서드를 하위클래스에서 사용할 수 있다.
 *    (하위클래스의 참조변수를 통해서 접근할 수 있다.)
 * 2. 상위클래스에 정의된 메서드와 동일한 메서드를 하위클래스에서 정의하고 사용할 수 있다.
 *    이런 경우 하위클래스의 메서드가 호출된다.
 *    => 상위클래스에 선언된 메서드와 동일한 메서드를 하위클래스에 정의하는 것을
 *       메서드 재정의(메서드 오버라이딩)라고 한다.
 *       		  ---------------
 *       			메서드명, 매개변수 개수, 매개변수 타입, 리턴타입 모두 동일해야 함.
*/
class Parent {
	public void display() {
		System.out.println("부모의 display...");
	}
}
class Child extends Parent {
	public void display() {
		System.out.println("자식의 display...");
		super.display();
	}
	public void test() {
		System.out.println("자식클래스의 test...");
		display();
	}
}

public class InheritanceTest02 {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.test();
		obj.display();
	}

}
