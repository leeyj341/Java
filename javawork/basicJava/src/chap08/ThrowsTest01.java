package chap08;
//���ܰ� �߻��� ������ ���ܸ� ó���ϵ��� ����
//���ܰ� �߻��� ������ ���ܸ� ó���ϸ� ȣ���ϴ� �������� � ���ܰ� �߻��ߴ��� �� �� ����
//���ܰ� �߻��� �� ��쿡 ���� �ٸ��� ó���ϰ� �; �� �� ����.
import java.util.Scanner;

public class ThrowsTest01 {
	//��길 �ϴ� �޼���
	public int test(int num1, int num2) {
		int result = 0;
		try {
			System.out.println("----------- test() �޼��� ���� -----------");
			System.out.println("�Է°�: " + num1);
			System.out.println("�Է°�: " + num2);
			result = num1 / num2;
			System.out.println("���: " + result);
			System.out.println("----------- test() �޼��� ���� -----------");
		} catch (ArithmeticException e) {
			//���ܰ� �߻��Ǹ� result �������� 0�� ����
			result = 0;
		}
		return result;	
	}
	//���ڸ� �����ϸ� test()�� ȣ���ϴ� �޼���
	public void show() {
		Scanner key = new Scanner(System.in);
		System.out.print("�����Է�: ");
		int num1 = key.nextInt();
		System.out.print("�����Է�: ");
		int num2 = key.nextInt();
		int result = test(num1, num2);
		
		//������ ����Ǿ�� �ϴ� ��ɹ�
		System.out.println("test() ȣ����: " + result);
	}
	public static void main(String[] args) {
		ThrowsTest01 obj = new ThrowsTest01();
		
		obj.show();
	}

}
