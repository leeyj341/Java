package oop.chap06;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("장동건", "서울시", 45); // 객체 또는 인스턴스
		/*p1.setName("장동건");
		p1.setAddress("서울시");;
		p1.setAge(45);	// age변수는 private로 선언되어 있으므로
						// 같은 패키지의 클래스에서도 접근할 수 없다.
*/
		System.out.println("성명: " + p1.getName());
		System.out.println("주소: " + p1.getAddress());
		System.out.println("나이: " + p1.getAge());
		
		Person p2 = new Person("김서연", "인천시", 25); // 객체 또는 인스턴스

		System.out.println("성명: " + p2.getName());
		System.out.println("주소: " + p2.getAddress());
		System.out.println("나이: " + p2.getAge());
	}

}
