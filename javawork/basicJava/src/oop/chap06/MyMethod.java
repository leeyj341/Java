package oop.chap06;
// 메서드 정의하는 연습을 위한 클래스
public class MyMethod {
	// 1. 매개변수가 없고 리턴값이 없는 메서드
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
	
	// 매개변수와 리턴값이 있는 메서드의 호출
	public int add(int num1, int num2) {
		return num1 + num2;
	}
}
