package app1;
/*
 * ���յ��� �ص��� ���� ���α׷�
 * => Ŭ�������� ���յ��� ���ϰ� �������� ����.
 * => ���Ǵ� Ŭ������ �����ϸ� �� Ŭ������ ����ϰ� �ִ� ��� �ҽ��� �����ؾ� �Ѵ�.
 * 	    ��, �����ؾ��ϴ� ������ �о�����.
 * 	  oopƯ���� ����Ǿ� ���� �ʴ�.
*/
public class MyBeanTest {
	public static void main(String[] args) {
		MyBeanStyleA obj = new MyBeanStyleA();
		run(obj);
		show(obj);
	}
	public static void run(MyBeanStyleA obj) {
		System.out.println("***************************");
		obj.testHello("����");
		obj.testHello("����");
		System.out.println("***************************");
	}
	public static void show(MyBeanStyleA obj) {
		System.out.println("===========================");
		obj.testHello("����");
		obj.testHello("����");
		System.out.println("===========================");
	}

}