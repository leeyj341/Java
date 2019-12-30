package jdbc.board.exam;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	BoardDAO dao = new BoardDAOImpl();
	
	public void insertMenu(){
		System.out.println("*******게시글등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("제목:");
		String title = key.next();
		System.out.print("내용:");
		String content = key.next();
	
		//여기에서 EmpDAO의 메소드를 호출하세요
		//int result = dao.insert(id, title, content);
		BoardDTO board = new BoardDTO(id, title, content);
		int result = dao.insert(board);
		//결과처리
		if(result > 0) {
			System.out.println("게시글 등록 성공");
		} else {
			System.out.println("글 등록 실패");
		}
		
	}
	public void updateMenu(){
		System.out.println("*******게시글수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("게시글번호:");
		String boardNum = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
		int result = dao.update(id, Integer.parseInt(boardNum));
		//결과처리
		if(result > 0) {
			System.out.println("게시글 수정 성공");
		} else {
			System.out.println("글 수정 실패");
		}
	}
	public void deleteMenu(){
		System.out.println("*******게시글삭제********");
		System.out.print("게시글번호:");
		String boardNum = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
		int result = dao.delete(Integer.parseInt(boardNum));
		//결과처리
		if(result > 0) {
			System.out.println("게시글 삭제 성공");
		} else {
			System.out.println("글 삭제 실패");
		}
	}
	public void searchByTitle(){
		System.out.println("*******제목으로 게시글 검색********");
		System.out.print("제목:");
		String title = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
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
		System.out.println("*******게시글 상세 보기********");
		System.out.print("게시글 번호:");
		int boardNum = key.nextInt();
		//여기에서 EmpDAO의 메소드를 호출하세요
		BoardDTO board = dao.read(boardNum);
		if(board == null) {
			System.out.println("조회된 데이터가 없습니다.");
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
		System.out.println("*******게시글 조회********");
		//여기에서 EmpDAO의 메소드를 호출하세요 - 전체사원조회
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


















