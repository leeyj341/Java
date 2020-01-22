package app3;

public class MyBeanStyleB extends MyBeanStyle {
	public MyBeanStyleB() {
		System.out.println("MyBeanStyleB의 기본 생성자");
	}
	@Override
	public void hello(String name) {
		System.out.println("Hello......." + name);
	}
}
