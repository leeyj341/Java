package chap08;

public class CalcTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		if(args.length < 3 | args.length > 3)
		{
			System.out.println("�ٽ� �Է� �ϼ���");
		}
		else {
			if(args[1].equals("/")) {
				System.out.println("���: " + calculator.divide(Integer.parseInt(args[0]), Integer.parseInt(args[2])));
			}
		}
	}
}
