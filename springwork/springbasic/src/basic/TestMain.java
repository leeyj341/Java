package basic;
public class TestMain {
	public static void main(String[] args) {
		//1. ������ �̿�
		//Insa insa = new InsaImpl();
		//MemberDTO user = new MemberDTO("jang","1234","�嵿��");
		
		//2. setter
		MemberDAO dao = new MemberDAO();
		Insa insa = new InsaImpl();
		insa.setDao(dao);
		MemberDTO user = new MemberDTO("jang","1234","�嵿��");
		
		insa.addUser(user);

	}

}
