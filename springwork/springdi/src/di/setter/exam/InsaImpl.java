package di.setter.exam;
public class InsaImpl implements Insa {
	MemberDAO dao;
	
	public InsaImpl() {
		System.out.println("기본 생성자");
	}
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
		System.out.println("InsaImpl 매개변수 1개 생성자");
	}
	
	public void setDao(MemberDAO dao) {
		System.out.println("setDao() 호출");
		this.dao = dao;
	}


	@Override
	public void addUser(MemberDTO user) {
		dao.add(user);		
	}

	@Override
	public MemberDTO getUser(String id) {
		dao.getUser("id");
		return null;
	}

}
