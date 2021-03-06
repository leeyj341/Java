package oop.chap07;
// static 메서드
// - static 멤버를 제어하기 위한 용도
// - 유틸리티처럼 자주 사용하는 메서드
public class StaticMethodDemo {
		public static void staticTest1() {
			//1. static메서드에서 static메서드 접근하기 - 일반적인 방법 가능
			staticTest2();
			System.out.println("staticTest1()");
		}
		public void display() {
			//2. non-static메서드에서 non-static메서드를 호출 - 일반적인 방법 가능
			show();
			System.out.println("display()");
		}
		public void show() {
			//3. non-static메서드에서 static메서드 호출 - 일반적인 방법 가능
			// 일반 메서드를 사용하는 시점에는 이미 static메서드가 메모리에 올라간 상태이기 때문에 가능하다.
			staticTest2();
			System.out.println("show()");
		}
		public static void staticTest2() {
			//4. static메서드에서 non-static메서드를 호출
			// -> non-static메서드가 메모리에 없기 때문에 같은 클래스에서 정의된
			//	   메서드라고 하더라도 무조건 객체생성 후에 호출해야 한다.
			StaticMethodDemo obj = new StaticMethodDemo();
			obj.show();
			System.out.println("staticTest2()");
		}
		public static void staticTest3() {
			
		}
}
