package jdbc.member.exam;

import java.util.ArrayList;

public interface MemberDAO {
	int insert(MemberDTO user);
	int update(String id, String addr);
	int delete(String id);//사원탈퇴
	ArrayList<MemberDTO> memberList();//전체사원목록조회
	ArrayList<MemberDTO> findByAddr(String addr);//주소로검색
	MemberDTO login(String id, String pass);
}
