package multi.erp.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
//dao의 메서드를 호출하는 클래스
@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	@Qualifier("boardDAO")
	BoardDAO dao;
	
	@Override
	public List<BoardVO> boardList() {
		return dao.boardList();
	}

	@Override
	public int txinsert(BoardVO board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(BoardVO board) {
		System.out.println("------------------" + board);
		int result = dao.insert(board);
		System.out.println("###########" + result);
		return result;
	}

	@Override
	public List<BoardVO> searchList(String search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> searchList(String tag, String search) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BoardVO> pageList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVO read(String board_no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(BoardVO board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String board_no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<BoardVO> findByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

}
