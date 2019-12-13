package oop.chap07;

class FinalSuper {
	public void display() {
		System.out.println("super display");
	}
}
class FinalSub extends FinalSuper {	// FinalSupper클래스는 상속이 불가능
	static final int NUM = 100;	// 상수로 선언했으므로 값을 수정할 수 없다.

	@Override					// 어노테이션 : 컴파일러에게 알려주기 위한 기호
	public void display() {		// final 메서드는 오버라이딩 할 수 없다.
		System.out.println("display");
	}
}

public class FinalTest {

	public static void main(String[] args) {
		FinalSub obj = new FinalSub();
		//FinalSub.NUM = 1000;
		System.out.println(FinalSub.NUM);
		obj.display();
	}

}
