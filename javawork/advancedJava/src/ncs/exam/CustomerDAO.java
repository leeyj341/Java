package ncs.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.board.exam.DBUtil;

public class CustomerDAO {
	
	public CustomerDAO() {
		
	}
	
	public int insert(CustomerDTO customer) {	
		System.out.println("dto사용 메서드: " + customer);
		
		String sql = "insert into customer values(?, ?, ?, sysdate, ?, ?)";
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;	
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, customer.getId());
			ptmt.setString(2, customer.getPass());
			ptmt.setString(3, customer.getName());
			ptmt.setInt(4, customer.getPoint());
			ptmt.setString(5, customer.getAddr());
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace(); // 오류 추적
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	
	public int update(String id, String addr) {
		String sql = "update customer set addr = ? where id = ?";
		
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, addr);
			ptmt.setString(2, id);
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	
	public int delete(String id) {
		StringBuffer sql = new StringBuffer("delete from customer ");
		sql.append("where id = ?");
		
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql.toString());
			ptmt.setString(1, id);
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
}
