package chap05;

import java.util.Random;

// 배열의 선언, 생성, 초기화를 한꺼번에 처리하는 방법
public class ArrayTest04 {

	public static void main(String[] args) {
		// 다른 언어와 동일한 방법으로 선언하기 - ,로 배열 요소를 구분
		// int[] myArr = new int[5];
		int[] myArr = {10, 20, 30, 40, 50};
		System.out.println("배열 요소의 갯수: " + myArr.length);
		
		for(int i = 0; i < myArr.length; i++)
		{
			System.out.println(myArr[i]);
		}
		
		// 자바언어 답게 선언, 생성, 초기화 방법
		int[] myArr2 = new int[] {10, 20, 30, 40, 50};
		System.out.println("배열 요소의 갯수: " + myArr2.length);
		
		for(int i = 0; i < myArr2.length; i++)
		{
			System.out.println(myArr2[i]);
		}
		
		// 참조형 배열의 선언과 생성과 초기화를 한꺼번에
		String[] strArr = {new String(),
							new String("servlet"),
							new String("spring")};
		System.out.println("참조형 배열의 갯수: " + strArr.length);
		// 참조형 배열이기 때문에 객체가 할당된 곳의 주소값이 출력되어야 하나,
		// String이 예외
		for(int i = 0; i < strArr.length; i++)
		{
			System.out.println(strArr[i]);
		}
		
		Random[] randArr = {new Random(), new Random()};
		for(int i = 0; i < randArr.length; i++)
		{
			System.out.println("배열요소 => " + randArr[i]);
		}
		
		// String 클래스는 기본형처럼 사용할 수 있다. - 가장 많이 쓰이는 참조형이므로 허용
		String[] strArr2 = {"java", "servlet", "spring", "hadoop"};
		System.out.println("갯수: " + strArr2.length);
		for(int i = 0; i < strArr2.length; i++)
		{
			System.out.println(strArr2[i]);
		}
		
	}

}
