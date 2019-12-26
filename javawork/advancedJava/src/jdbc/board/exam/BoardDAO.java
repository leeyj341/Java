package jdbc.board.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// tb_board 테이블을 엑세스하는 기능이 정의된 클래스
public class BoardDAO {
	public BoardDAO() {
		
	}
	public void insert(String id, String title, String content) {	
		String sql = "insert into tb_board values(board_seq.nextval, ?, ?, ?, sysdate, 0)";
		
		PreparedStatement ptmt = null;
		
		try {
			ptmt = DBUtil.getConnect().prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, title);
			ptmt.setString(3, content);
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행 삽입 성공");
		} catch (SQLException e) {
			System.out.println("연결 실패:");
			e.printStackTrace(); // 오류 추적
		} finally {
			try {
				if(ptmt != null) ptmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void update(String id, int boardNum) {
		String sql = "update tb_board set id = ? where boardnum = ?";
		
		PreparedStatement ptmt = null;
		
		try {
			ptmt = DBUtil.getConnect().prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setInt(2, boardNum);
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행이 수정됐습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ptmt != null) ptmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void delete(int boardNum) {
		StringBuffer sql = new StringBuffer("delete from tb_board ");
		sql.append("where boardnum = ?");
		PreparedStatement ptmt = null;
		
		try {
			ptmt = DBUtil.getConnect().prepareStatement(sql.toString());
			ptmt.setInt(1, boardNum);
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행이 삭제됐습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ptmt != null) ptmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void select() {
		String sql = "select boardnum, id, title, content from tb_board";

		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		try {
			ptmt = DBUtil.getConnect().prepareStatement(sql);
			rs = ptmt.executeQuery();

			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.println(rs.getString("content") + "\t");
				//System.out.print(rs.getDate(5) + "\t");
				//System.out.println(rs.getInt(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(ptmt != null) ptmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
