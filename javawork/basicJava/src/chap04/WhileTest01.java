package chap04;
// while문 연습 - ForTest01.java에서 작업한 내용을 while문으로 변경
//"자바 프로그래밍" 5번 출력
public class WhileTest01 {
	public static void main(String[] args)
	{
		int num = 0;
		
		while(num < 5)
		{
			num++;
			System.out.println("자바 프로그래밍: " + num);
		}
		System.out.println("======================================");
		num = 0;
		while(true)
		{
			if(num >= 5) {
				break;
			}
			num++;
			System.out.println("자바 프로그래밍: " + num);
		}
	}
}
