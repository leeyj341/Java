package oop.chap07;

class FinalSuper {
	public void display() {
		System.out.println("super display");
	}
}
class FinalSub extends FinalSuper {	// FinalSupperŬ������ ����� �Ұ���
	static final int NUM = 100;	// ����� ���������Ƿ� ���� ������ �� ����.

	@Override					// ������̼� : �����Ϸ����� �˷��ֱ� ���� ��ȣ
	public void display() {		// final �޼���� �������̵� �� �� ����.
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