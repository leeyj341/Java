package chap04;

import java.util.Scanner;

//switch 연습 - 기본문법
//switch문의 특성을 활용
public class SwitchTest02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.");
		int ssn = scanner.nextInt(); 
		switch (ssn) { 
			case 1: case 3:
				System.out.println("남자");
				break;	
			case 2: case 4:
				System.out.println("여자");
				break;
			default:	
				System.out.println("기타");
				break;
		}

	}

}
