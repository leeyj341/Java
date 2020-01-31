package multi.erp.board;

import java.util.List;

public interface BoardDAO {
	//게시판 목록보기
	List<BoardVO> boardList();
	//게시판 등록
	int insert(BoardVO board);
	List<BoardVO> searchList(String search);
	List<BoardVO> searchList(String tag,String search);
	List<BoardVO> pageList();
	//상세보기
	BoardVO read(String board_no);
	//게시판 글 수정
	int update(BoardVO board);
	//게시판 글 삭제
	int delete(String board_no);
}
