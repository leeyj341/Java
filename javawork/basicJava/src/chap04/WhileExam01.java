package chap04;
// ForExam03.java를 while문으로 변경하기
public class WhileExam01 {

	public static void main(String[] args) {
		
		int num = 0;
		int oddNum = 0;
		int i = 0;
		
		while(i < 100)
		{
			i++;
			num += i;
			
			if(i % 2 != 0)
			{
				oddNum += i;
			}
		}
		System.out.println("합: " + num);
		System.out.println("홀수합: " + oddNum);
		System.out.println("짝수합: " + (num - oddNum));
	}

}
