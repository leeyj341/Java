package api.util;

import java.util.Scanner;

// Scanner 클래스(API)의 사용법
// => 프로그램 실행 중간에 값을 입력받을 수 있는 기능들을 제공한다.
public class ScannerTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("문자열을 입력하세요: ");
		String data = key.next();	// Space나 Enter를 만나기 전까지 출력
		System.out.println("키보드로 입력받은 문자열: " + data);
		System.out.print("숫자를 입력하세요: ");
		int intVal = key.nextInt();
		System.out.println("입력받은 숫자: " + intVal);
	}

}
