package chap04;
// if문을 중첩해서 사용하는 연습 - gender와 age를 판단해서 결과를 출력하는 예제
import java.util.Scanner;
// ctrl + shift + f => 코드 정리
public class IfExam02 {
	public static void main(String[] args) {
		// 성별과 나이를 입력받아서 다음과 같이 출력하기
		// 입력값: 1, 3은 남자 2, 4는 여자
		// 나이 1 ~ 19: 청소년, 그 외 성인

		Scanner scanner = new Scanner(System.in);

		int gender = scanner.nextInt();
		int age = scanner.nextInt();

		System.out.print("성별 " + gender + "와(과) 나이" + age + "을(를) 입력한 경우: ");

		if (gender < 5 & gender > 0) {
			if (gender % 2 == 0) {
				if (age < 20) {
					System.out.println("청소년여자");
				} else {
					System.out.println("성인여자");
				}
			} else {
				if (age < 20) {
					System.out.println("청소년남자");
				} else {
					System.out.println("성인남자");
				}
			}
		} else {
			System.out.println("숫자를 잘못 입력");
		}

	}

}
