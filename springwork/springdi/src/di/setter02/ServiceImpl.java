package di.setter02;

public class ServiceImpl implements Service {
	Logic myLogic;
	String name;
	String msg;
	
	public ServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public Logic getMyLogic() {
		return myLogic;
	}
	public void setMyLogic(Logic myLogic) {
		this.myLogic = myLogic;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}



	@Override
	public void test() {
		// Logic�� �޼��带 ȣ���ϴ� �޼��� 
		System.out.println(msg + ", " + name);
		myLogic.testLogic();
	}

}
