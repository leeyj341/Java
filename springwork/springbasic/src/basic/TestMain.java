package basic;
public class TestMain {
	public static void main(String[] args) {
		//1. 생성자 이용
		//Insa insa = new InsaImpl();
		//MemberDTO user = new MemberDTO("jang","1234","장동건");
		
		//2. setter
		MemberDAO dao = new MemberDAO();
		Insa insa = new InsaImpl();
		insa.setDao(dao);
		MemberDTO user = new MemberDTO("jang","1234","장동건");
		
		insa.addUser(user);

	}

}
