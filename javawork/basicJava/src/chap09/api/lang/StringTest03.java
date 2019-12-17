package chap09.api.lang;
//String클래스의 기본 메서드와 String클래스의 특징
public class StringTest03 {

	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("재밌다.");
		//원본변환
		System.out.println("str1.toUpperCase() => " + str1.toUpperCase());
		System.out.println("원본데이터 : " + str1);
		System.out.println("str1.toLowerCase() => " + str1.toLowerCase());
		System.out.println("str1.substring(2) => " + str1.substring(2));
		System.out.println("str1.substring(2) => " + str1.substring(2, 8));
		System.out.println("str1.replace('a', 'A') => " + str1.replace('a', 'A'));
		System.out.println("원본데이터 : " + str1);
	}

}
