package chap08;
//�޼��带 ȣ���ϴ� ������ ���ܸ� ó���ϵ��� ����

import java.util.Scanner;

public class ThrowsTest02 {
	//test�޼���� ArithmeticException�� �߻��� �� �ִ� �޼����' �� ȣ���ϴ� ���� �˷���.
	public int test(int num1, int num2) throws ArithmeticException {
		int result = 0;
		System.out.println("----------- test() �޼��� ���� -----------");
		System.out.println("�Է°�: " + num1);
		System.out.println("�Է°�: " + num2);
		result = num1 / num2;
		System.out.println("���: " + result);
		System.out.println("----------- test() �޼��� ���� -----------");
		return result;	
	}
	//���ܸ� ȣ���ϴ� ������ ���� ó���ϱ�
	public void show() {
		int result = 0;
		int num1 = 0;
		int num2 = 0;
		try {
			Scanner key = new Scanner(System.in);
			System.out.print("�����Է�: ");
			num1 = key.nextInt();
			System.out.print("�����Է�: ");
			num2 = key.nextInt();
			result = test(num1, num2);
		} catch (ArithmeticException e) {
			if(num1 % 10 == 0) result = 1000;
			else if(num1 % 7 == 0) result = 10000;
			else result = 100;
		} finally {
			//������ ����Ǿ�� �ϴ� ��ɹ�
			System.out.println("test() ȣ����: " + result);
		}
		
		
	}
	public static void main(String[] args) {
		ThrowsTest02 obj = new ThrowsTest02();
		obj.show();
	}

}
