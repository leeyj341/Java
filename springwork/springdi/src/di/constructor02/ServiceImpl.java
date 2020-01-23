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
		System.out.println("ServiceImpl의 매개변수 3개 생성자");
	}

	@Override
	public void test() {
		// Logic의 메서드를 호출하는 메서드 
		System.out.println(msg + ", " + name);
		myLogic.testLogic();
	}

}
