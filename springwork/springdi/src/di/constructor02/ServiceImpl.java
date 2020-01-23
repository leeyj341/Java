package di.constructor02;

public class ServiceImpl implements Service {
	Logic myLogic;
	String name;
	String msg;
	
	public ServiceImpl(Logic myLogic, String name, String msg) {
		super();
		this.myLogic = myLogic;
		this.name = name;
		this.msg = msg;
		System.out.println("ServiceImpl�� �Ű����� 3�� ������");
	}

	@Override
	public void test() {
		// Logic�� �޼��带 ȣ���ϴ� �޼��� 
		System.out.println(msg + ", " + name);
		myLogic.testLogic();
	}

}
