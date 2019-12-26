package jdbc.board.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// tb_board ���̺��� �������ϴ� ����� ���ǵ� Ŭ����
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
			System.out.println(result + "�� �� ���� ����");
		} catch (SQLException e) {
			System.out.println("���� ����:");
			e.printStackTrace(); // ���� ����
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
			System.out.println(result + "�� ���� �����ƽ��ϴ�.");
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
			System.out.println(result + "�� ���� �����ƽ��ϴ�.");
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
