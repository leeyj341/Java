package basic;
public interface Insa {
	void setDao(MemberDAO dao);
	void addUser(MemberDTO user);
	MemberDTO getUser(String id);
}

