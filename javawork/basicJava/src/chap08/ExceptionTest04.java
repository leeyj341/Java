package chap08;
// 예외가 발생하거나 발생하지 않거나 반드시 실행할 명령문이 있는 경우???
// finally블럭을 추가하고 정의한다.
import java.util.Scanner;

public class ExceptionTest04 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		// 오류가 발생할 수 있는 모든 구문을 try문에 넣어준다.
		try {
			System.out.print("배열의 요소 개수를 입력하세요: ");
			int size = key.nextInt();
			String[] arr = new String[size];
			System.out.println("step01");
			if(size > 3) {
				arr[1] = new String("java");
			}
			System.out.println(arr[1].length());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 요소를 잘못액세스...");
		} catch (NullPointerException e) {
			System.out.println("널입니다.");
		} catch (Exception e) {
			System.out.println("오류발생!");
		} finally {
			// 예외가 발생하든 안하든 실행해야 하는 명령
			System.out.println("반드시 실행할 명령문 - 무조건 실행");
		}

	}

}
