package chap04;

import java.util.Scanner;

// while 문과 do...while문의 차이점
public class DoWhileTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = 10;
		while(num < 10)
		{
			//while문은 조건을 만족하지 않으면 블럭 안의 코드가 실행되지 않는다.
			System.out.println("while문 - 실행명령문: " + num);
			num++;
		}
		//num = 10;
		do {
			System.out.print("숫자 입력 : ");
			num = key.nextInt();
			System.out.println("do...while문 - 실행명령문: " + num);
		} while(num > 10);
	}

}
