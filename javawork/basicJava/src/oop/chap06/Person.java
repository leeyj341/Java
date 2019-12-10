package oop.chap06;
// 클래스를 정의하고 멤버변수를 정의하는 방법
// - 멤버변수를 정의할 때는 특별한 경우를 제외하고 초기값을 주지 않는다.
// - 초기값을 정의하지 않아도 참조형은 null, 정수형 0, 실수형 0.0, boolean은 false
// - 멤버변수를 정의할 때 접근 제어자를 추가해서 접근을 제어할 수 있다.
//	 public
//	 default
//	 protected
//	 private
public class Person {
	private String name;		// 클래스의 특성을 나타내는 데이터 - 멤버변수 or 필드
	private String address;		// 클래스 변수(static)과 인스턴스 변수는 초기화가 필요없음
	private int age;
	
	public String getName() {
		return name;
	}
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
