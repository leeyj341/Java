package oop.chap06;

import java.util.Iterator;

// 메서드의 매개변수로 기본형과 참조형을 정의하는 경우 차이점
public class CallByTest {
	public static void main(String[] args) {
		CallByTest obj = new CallByTest();
		int i = 100;
		int[] myarr = new int[5];
		
		for (int j = 0; j < myarr.length; j++) {
			myarr[j] = 100;
		}
		
		System.out.println("======== change 호출 전 ========");
		obj.display(i, myarr);
		obj.change(i, myarr);
		System.out.println("======== change 호출 후 ========");
		obj.display(i, myarr);
		

	}
	// 매개변수로 전달된 num의 값과 myarr가 참조하는 배열의 요소 값을 출력하는 메서드
	public void display(int num, int[] myarr) {
		System.out.println("i = " + num);
		System.out.println("myarr의 요소 값");
		for (int i = 0; i < myarr.length; i++) {
			System.out.print(myarr[i] + "\t");
		}
		System.out.println();
	}
	// 매개변수로 전달된 i와 myarr가 참조하는 배열의 요소 값을 변경하는 메서드
	public void change(int i, int[] myarr) {
		i = 200;
		myarr[1] = 200;
	}

}
