package basic;
public class InsaImpl implements Insa {
	MemberDAO dao;
	
	// 1. �����ڸ� ����ϴ� ���
	public InsaImpl() {
		dao = new MemberDAO();
	}
	public InsaImpl(MemberDAO dao) {
		super();
		this.dao = dao;
	}
	// 2. setter�޼��带 ȣ���ϴ� ���
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
