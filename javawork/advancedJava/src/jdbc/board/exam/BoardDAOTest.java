package jdbc.board.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardDAOTest {
	public static void main(String[] args) {
		BoardDAOImpl dao = new BoardDAOImpl();
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
		ArrayList<BoardDTO> list = dao.select();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getBoardNum() + "\t" +
					list.get(i).getId() + "\t" +
					list.get(i).getTitle() + "\t" +
					list.get(i).getContent() + "\t" +
					list.get(i).getWriteDate() + "\t" +
					list.get(i).getHit());
		}
	}

}
