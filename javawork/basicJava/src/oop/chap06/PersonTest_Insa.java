package oop.chap06;

import java.util.Scanner;

public class PersonTest_Insa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*********** 인사관리 시스템 ***********");
		System.out.println("1. 인사등록");
		System.out.println("2. 정보수정");
		System.out.println("3. 개인정보조회");
		System.out.println("4. 사원목록조회");
		System.out.print("원하는 직업을 선택하세요: ");
		int work = scanner.nextInt();
		switch (work) {
			case 1:
				System.out.println("==== 인사등록 ====");
				System.out.print("성명 : ");
				String name = scanner.next();
				System.out.print("주소 : ");
				String addr = scanner.next();
				System.out.print("나이 : ");
				int age = scanner.nextInt();
				Person p = new Person();
				/*p.name = name;	// Person 객체의 name 변수 = 사용자가 입력한 name 값
				p.address = addr;
				p.age = age;
				
				System.out.println(p.name + " , " + p.address + " , " + p.age);*/

				break;
			case 2:
				System.out.println("======== 정보수정하기 =========");
			}

	}

}
