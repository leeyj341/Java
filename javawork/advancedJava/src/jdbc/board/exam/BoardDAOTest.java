package jdbc.board.exam;

import java.util.Scanner;

public class BoardDAOTest {
	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		Scanner key = new Scanner(System.in);
		
		System.out.println("********* 게시글 등록 *********");
		/*System.out.print("아이디 : ");
		String id = key.next();*/
		/*System.out.print("제목 : ");
		String title = key.next();
		System.out.print("내용 : ");
		String content = key.next();*/
		
		/*System.out.print("게시판 번호 : ");
		int boardNum = key.nextInt();*/
		
		//dao.insert(id, title, content);
		//dao.update(id, boardNum);
		//dao.delete(boardNum);
		dao.select();
	}

}
