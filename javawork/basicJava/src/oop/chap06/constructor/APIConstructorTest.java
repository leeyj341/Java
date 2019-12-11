package oop.chap06.constructor;
// API의 클래스에 정의된 생성자메서드 확인하기
public class APIConstructorTest {

	public static void main(String[] args) {
		byte[] data1 = {65, 66, 67, 68, 69};
		char[] data2 = {'a', 'b', 'c', 'd', 'e'};
		String str = new String(); // String str = ""; 로 대체
		String str1 = new String("java");
		String str2 = new String(data1);
		String str3 = new String(data1, 2, 2);
		String str4 = new String(data2);
		
		System.out.println(str1 + " : " + str1.length());
		System.out.println(str2 + " : " + str2.length());
		System.out.println(str3 + " : " + str3.length());
		System.out.println(str4 + " : " + str4.length());
	}

}
