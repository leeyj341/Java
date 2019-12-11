package oop.chap06;
// 클래스를 정의하고 멤버변수를 정의하는 방법
// - 멤버변수를 정의할 때는 특별한 경우를 제외하고 초기값을 주지 않는다.
// - 초기값을 정의하지 않아도 참조형은 null, 정수형 0, 실수형 0.0, boolean은 false
// - 멤버변수를 정의할 때 접근 제어자를 추가해서 접근을 제어할 수 있다.
//	 public
//	 default
//	 protected
//	 private
// 클래스를 정의할 때 멤버변수는 private로 선언해서 외부에서 접근할 수 없도록 정보를 은닉하고
// public 메서드를 통해서 접근할 수 있도록 해야 한다.
public class Person {
	private String name;		// 클래스의 특성을 나타내는 데이터 - 멤버변수 or 필드
	private String address;		// 클래스 변수(static)과 인스턴스 변수는 초기화가 필요없음
	private int age;
	
	public Person() {
		
	}
	public Person(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	// 모든 멤버변수는 private로 선언되어 있기 때문에 값을 설정하는 메서드와
	// 값을 가져올 수 있는 메서드가 필요하다.
	// 이런 역할을 하는 메서드를 정의하는 경우
	
	// name 변수에 저장된 값을 호출하는 곳으로 넘겨줄 메서드
	// 메서드 명: get + 멤버변수명(첫 글자를 대문자로 바꾼)
	
	// name 변수에 값을 절정하는 메서드
	// 메서드 명: set + 멤버변수명(첫 글자를 대문자로 바꾼)
	
	// getter 메서드
	public String getName() {
		return name;
	}
	// setter 메서드
	public void setName(String name) {	
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
