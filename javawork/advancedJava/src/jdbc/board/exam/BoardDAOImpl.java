package jdbc.board.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// tb_board 테이블을 엑세스하는 기능이 정의된 클래스
public class BoardDAOImpl implements BoardDAO {
	
	public int insert(BoardDTO board) {	
		System.out.println("dto사용 메서드: " + board);
		
		String sql = "insert into tb_board values(board_seq.nextval, ?, ?, ?, sysdate, 0)";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;	// 메서드의 실행 결과가 저장될 변수
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, board.getId());
			ptmt.setString(2, board.getTitle());
			ptmt.setString(3, board.getContent());
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace(); // 오류 추적
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	
	public int insert(String id, String title, String content) {	
		String sql = "insert into tb_board values(board_seq.nextval, ?, ?, ?, sysdate, 0)";
		
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;	// 메서드의 실행 결과가 저장될 변수
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, title);
			ptmt.setString(3, content);
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace(); // 오류 추적
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	
	public int update(String id, int boardNum) {
		String sql = "update tb_board set id = ? where boardnum = ?";
		
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setInt(2, boardNum);
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	
	public int delete(int boardNum) {
		StringBuffer sql = new StringBuffer("delete from tb_board ");
		sql.append("where boardnum = ?");
		
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql.toString());
			ptmt.setInt(1, boardNum);
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	
	public ArrayList<BoardDTO> select() {
		String sql = "select * from tb_board";

		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		BoardDTO board = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();

			while (rs.next()) {
				// 1. 조회한 레코드의 컬럼을 읽어서 DTO로 변환하는 작업
				board = new BoardDTO(rs.getInt("boardNum"),
											rs.getString("id"),
											rs.getString("title"),
											rs.getString("content"),
											rs.getDate("write_date"),
											rs.getInt("hit"));
				// 2. 변환된 레코드를 ArrayList에 추가
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		return list;
	}
	
	@Override
	public BoardDTO read(int boardNum) {
		String sql = "select * from tb_board where boardnum = ?";
		
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		BoardDTO board = null;

		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, boardNum);
			rs = ptmt.executeQuery();
			// primary key로 검색하는 것이기 때문에 while문을 돌 필요가 없다.
			if (rs.next()) {
				board = new BoardDTO(rs.getInt("boardNum"),
						rs.getString("id"),
						rs.getString("title"),
						rs.getString("content"),
						rs.getDate("write_date"),
						rs.getInt("hit"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		
		return board;
	}
	
	@Override
	public ArrayList<BoardDTO> findByTitle(String title) {
		String sql = "select * from tb_board where title like ?";

		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		BoardDTO board = null;
		StringBuffer sbf = new StringBuffer();
		sbf.append("%");
		sbf.append(title);
		sbf.append("%");
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, sbf.toString());
			rs = ptmt.executeQuery();

			while (rs.next()) {
				// 1. 조회한 레코드의 컬럼을 읽어서 DTO로 변환하는 작업
				board = new BoardDTO(rs.getInt("boardNum"),
											rs.getString("id"),
											rs.getString("title"),
											rs.getString("content"),
											rs.getDate("write_date"),
											rs.getInt("hit"));
				// 2. 변환된 레코드를 ArrayList에 추가
				list.add(board);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		return list;
	}
	
	@Override
	public int updateHit(int boardNum) {
		Connection con = null;
		PreparedStatement ptmt = null;
		
		String sql = "update tb_board set hit = hit + 1 where boardnum = ?";
		int result = 0;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, boardNum);
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		
		}
		return result;
	}
}
