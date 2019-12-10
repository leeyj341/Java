package oop.chap06;
// MyMethod클래스에서 정의한 Method를 사용하는 클래스
public class MyMethodTest {

	public static void main(String[] args) {
		MyMethod m = new MyMethod();
		
		// 1. 매개변수가 없고 void인 메서드의 호출
		System.out.println("=================== step1");
		m.display();
		System.out.println("=================== step2");
		m.display();
		
		// 2. 매개변수가 한 개, 리턴값이 없는 메서드 호출
		m.display("★");
		m.display("※");
		m.display("▣");
		System.out.println("============================");
		
		// 3. 리턴값이 없고 매개변수가 두 개인 메서드
		m.display("☆", 10);
		m.display("◎", 8);
		m.display("■", 6);
		System.out.println("============================");
		
		// 4. 매개변수, 리턴값이 모두 있는 메서드
		// 메서드를 호출하는 경우 리턴값이 존재하는 메서드라면
		// 1. 리턴값과 동일한 타입의 변수를 선언해서 저장해 주어야 한다.
		// 2. 다른 메서드의 매개변수로 전달할 수 있다.
		int result = m.add(200, 300);
		
		System.out.println("호출 결과 => " + result);
		System.out.println("호출 결과 => " + m.add(200, 300));
		System.out.println("============================");
		
	
		
	}

}
