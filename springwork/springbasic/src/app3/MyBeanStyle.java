package app3;

public abstract class MyBeanStyle {
	public abstract void hello(String name);
	
	//��ü�� ������ �� �� �� ȣ��Ǵ� �޼���
	public void myInit() {
		System.out.println("init.......");
	}
	//��ü�� �Ҹ�� �� �� �� ȣ��Ǵ� �޼���
	public void myDestroy() {
		System.out.println("destroy......");
	}
}
