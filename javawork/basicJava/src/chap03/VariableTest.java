package chap03;
// 기본형과 참조형 변수의 비교
public class VariableTest {
	public static void main(String[] args) {
		// 기본형 변수
		int i = 10;
		int j = 10;
		System.out.println("============== 기본형 ==============");
		if(i == j) 
		{
			System.out.println("기본형 같다");
		}
		else 
		{
			System.out.println("기본형 다르다");
		}
		// 참조형 변수
		System.out.println("============== 참조형 ==============");
		String str1 = new String("java");
		String str2 = new String("java");
		// str1 = str2;
		if(str1 == str2)
		{
			System.out.println("참조형 같다");
		}
		else
		{
			System.out.println("참조형 다르다");
		}
		// 문자열 비교
		if(str1.equals(str2))
		{
			System.out.println("문자열 같다");
		}
		else
		{
			System.out.println("문자열 다르다");
		}
		// 조건은 당연히 true나 false를 return
		// or boolean형을 return값으로 갖는 메서드를 사용한다.
	}

}
