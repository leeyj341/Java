package chap03;
//비교연산자
public class OprTest02 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		int num3 = 100;
		
		
		// num1변수 앞 +연산자로 문자열의 영향으로 문자열화 되었기 때문에 오류가 발생함
		// - 비교연산이나 사칙연산을 할 수 없다.
		System.out.println("더한 결과  => " + (num1 + num2));
		System.out.println("num1 > num2 ==> " + (num1 > num2));
		System.out.println("num1 >= num2 ==> " + (num1 >= num2));
		System.out.println("num1 < num2 ==> " + (num1 < num2));
		System.out.println("num1 <= num2 ==> " + (num1 <= num2));
		
		System.out.println("num1 == num3 ==> " + (num1 == num3));
		System.out.println("num2 == num3 ==> " + (num2 == num3));
		System.out.println("num1 != num3 ==> " + (num1 != num3));
		
	}

}
