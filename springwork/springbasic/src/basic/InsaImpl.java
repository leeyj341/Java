package basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	
	// 1. 생성자를 사용하는 방법
	public InsaImpl() {
		dao = new MemberDAO();
	}
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
	}
	// 2. setter메서드를 호출하는 방법
	public void setDao(MemberDAO dao) {
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
