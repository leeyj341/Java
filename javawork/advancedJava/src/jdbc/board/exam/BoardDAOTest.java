package jdbc.board.exam;

import java.util.Scanner;

public class BoardDAOTest {
	public static void main(String[] args) {
		BoardDAO dao = new BoardDAO();
		Scanner key = new Scanner(System.in);
		
		System.out.println("********* �Խñ� ��� *********");
		/*System.out.print("���̵� : ");
		String id = key.next();*/
		/*System.out.print("���� : ");
		String title = key.next();
		System.out.print("���� : ");
		String content = key.next();*/
		
		/*System.out.print("�Խ��� ��ȣ : ");
		int boardNum = key.nextInt();*/
		
		//dao.insert(id, title, content);
		//dao.update(id, boardNum);
		//dao.delete(boardNum);
		dao.select();
	}

}
