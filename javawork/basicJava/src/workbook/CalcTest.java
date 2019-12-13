package workbook;

public class CalcTest {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		if(args.length < 3 | args.length > 3)
		{
			System.out.println("다시 입력 하세요");
		}
		else {
			switch (args[1]) {
			case "+":
				System.out.println("결과: " + calculator.plus(Integer.parseInt(args[0]), Integer.parseInt(args[2])));
				break;
			case "-":
				System.out.println("결과: " + calculator.minus(Integer.parseInt(args[0]), Integer.parseInt(args[2])));
				break;
			case "x":
				System.out.println("결과: " + calculator.multiplication(Integer.parseInt(args[0]), Integer.parseInt(args[2])));
				break;
			case "/":
				System.out.println("결과: " + calculator.divide(Integer.parseInt(args[0]), Integer.parseInt(args[2])));
				break;
			}
		}
		

	}

}
