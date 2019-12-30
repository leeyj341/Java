package jdbc.board.exam;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	BoardDAO dao = new BoardDAOImpl();
	
	public void insertMenu(){
		System.out.println("*******�Խñ۵��********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("����:");
		String title = key.next();
		System.out.print("����:");
		String content = key.next();
	
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		//int result = dao.insert(id, title, content);
		BoardDTO board = new BoardDTO(id, title, content);
		int result = dao.insert(board);
		//���ó��
		if(result > 0) {
			System.out.println("�Խñ� ��� ����");
		} else {
			System.out.println("�� ��� ����");
		}
		
	}
	public void updateMenu(){
		System.out.println("*******�Խñۼ���********");
		System.out.print("���̵�:");
		String id = key.next();
		System.out.print("�Խñ۹�ȣ:");
		String boardNum = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.update(id, Integer.parseInt(boardNum));
		//���ó��
		if(result > 0) {
			System.out.println("�Խñ� ���� ����");
		} else {
			System.out.println("�� ���� ����");
		}
	}
	public void deleteMenu(){
		System.out.println("*******�Խñۻ���********");
		System.out.print("�Խñ۹�ȣ:");
		String boardNum = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		int result = dao.delete(Integer.parseInt(boardNum));
		//���ó��
		if(result > 0) {
			System.out.println("�Խñ� ���� ����");
		} else {
			System.out.println("�� ���� ����");
		}
	}
	public void searchByTitle(){
		System.out.println("*******�������� �Խñ� �˻�********");
		System.out.print("����:");
		String title = key.next();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		ArrayList<BoardDTO> boardlist = dao.findByTitle(title);
		int size = boardlist.size();
		for (int i = 0; i < size; i++) {
			BoardDTO board = boardlist.get(i);
			System.out.println(board.getBoardNum() + "\t" +
					board.getId() + "\t" +
					board.getTitle() + "\t" +
					board.getHit());
		}
	}
	public void searchByBoardNum(){
		System.out.println("*******�Խñ� �� ����********");
		System.out.print("�Խñ� ��ȣ:");
		int boardNum = key.nextInt();
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ���
		BoardDTO board = dao.read(boardNum);
		if(board == null) {
			System.out.println("��ȸ�� �����Ͱ� �����ϴ�.");
		} else {
			dao.updateHit(boardNum);
			System.out.println(board.getBoardNum() + "\t" +
					board.getId() + "\t" +
					board.getTitle() + "\t" +
					board.getContent() + "\t" +
					board.getWriteDate() + "\t" +
					board.getHit());
		}
	}
	
	
	public void selectMenu(){
		System.out.println("*******�Խñ� ��ȸ********");
		//���⿡�� EmpDAO�� �޼ҵ带 ȣ���ϼ��� - ��ü�����ȸ
		ArrayList<BoardDTO> boardlist = dao.select();
		int size = boardlist.size();
		for (int i = 0; i < size; i++) {
			BoardDTO board = boardlist.get(i);
			System.out.println(board.getBoardNum() + "\t" +
					board.getTitle() + "\t" +
					board.getId() + "\t" +
					board.getHit() + "\t");
		}
	}
}


















