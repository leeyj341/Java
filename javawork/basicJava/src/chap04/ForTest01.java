package chap04;
// for문 연습 - 기본 for연습(for문의 문법)
public class ForTest01 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++)
		{
			System.out.println("자바 프로그래밍: " + (i + 1));
		}
		System.out.println("==================================");

		for(int i = 11; i < 16; i++)
		{
			System.out.println("자바 프로그래밍");
		}
		System.out.println("==================================");
		
		for(int i = 5; i > 0; i--)
		{
			System.out.println("자바 프로그래밍");
		}
		System.out.println("==================================");
	}

}
