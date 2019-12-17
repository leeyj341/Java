package chap08;

public class CalcTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		if(args.length < 3 | args.length > 3)
		{
			System.out.println("다시 입력 하세요");
		}
		else {
			if(args[1].equals("/")) {
				System.out.println("결과: " + calculator.divide(Integer.parseInt(args[0]), Integer.parseInt(args[2])));
			}
		}
	}
}
