package oop.chap06;
// �޼��� �����ϴ� ������ ���� Ŭ����
public class MyMethod {
	// 1. �Ű������� ���� ���ϰ��� ���� �޼���
	public void display() {
		for(int i = 0; i < 10; i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	public void display(String str) {
		for(int i = 0; i < 10; i++)
		{
			System.out.print(str);
		}
		System.out.println();
	}
	
	public void display(String str, int count) {
		for(int i = 0; i < count; i++)
		{
			System.out.print(str);
		}
		System.out.println();
	}
	
	// �Ű������� ���ϰ��� �ִ� �޼����� ȣ��
	public int add(int num1, int num2) {
		return num1 + num2;
	}
}