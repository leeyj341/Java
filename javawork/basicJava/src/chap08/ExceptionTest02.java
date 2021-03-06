package chap08;
// 예외발생 코드가 정의된 클래스
public class ExceptionTest02 {
	public static void main(String[] args) {
		try {
			System.out.println("******** 프로그램 시작 ********");
			System.out.println(10 / 0); // 예외가 발생할 수 있는 문장
			System.out.println("******** 프로그램 종료 ********");
			
		} catch (ArithmeticException e) { // 몇번째 라인에서 오류가 만들어지는지 보여줌.
			System.out.println("오류발생................!");
			System.out.println("예외메시지:  + e.getMessage()");
			e.printStackTrace(); 
		}
	}

}
