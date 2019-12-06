package test.exam;
public class TypeCastingTest  
{
	public static void main(String[] args) 
	{
		// 기본형에서 형변환
		// 자동형변환(큰 데이터 타입의 변수에 작은 데이터 타입 변수를 할당)
		byte b1 = 10;
		short s = b1;
		int i = s;
		long l = i;
		
		float f = l;
		double d = f;

		System.out.println(d);

		char c = 'A';
		System.out.println(c);

		//A의 Ascii값을 사용학 싶은 경우
		int data = c;	// int = char : 자동형변환
		System.out.println(data);


		// 명시적 형변환 
		// 기본형에서 명시적 형변환
		byte bytedata = (byte)200;
		System.out.println(bytedata);

		int intdata = 111;	
		// int -> char
		char chardata = (char)intdata;
		System.out.println((char)intdata);
		System.out.println((char)115);

		double doubledata = (double)20/100*100;
		System.out.println(doubledata);
	}
}
