package jdbc.member.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;

public class MemberDAOImpl implements MemberDAO {

	@Override
	public int insert(MemberDTO user) {
		System.out.println(user);
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "insert into member values(?, ?, ?, ?, ?, sysdate, 1000)";
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, user.getId());
			ptmt.setString(2, user.getPass());
			ptmt.setString(3, user.getName());
			ptmt.setString(4, user.getAddr());
			ptmt.setString(5, user.getDeptno());
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		
		return result;
	}
	
	@Override
	public int update(String id, String addr) {
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "update member set addr = ? where id = ?";
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, addr);
			ptmt.setString(2, id);
			result = ptmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		
		return result;
	}

	@Override
	public int delete(String id) {
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "delete from member where id = ?";
		int result = 0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			result = ptmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		
		return result;
	}

	@Override
	public ArrayList<MemberDTO> memberList() {
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		String sql = "select * from member";
		ArrayList<MemberDTO> arrMember = new ArrayList<MemberDTO>();
		MemberDTO member = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				member = new MemberDTO(rs.getString("id"), rs.getString("pass"), rs.getString("name"),
							rs.getString("addr"), rs.getString("deptno"), rs.getDate("hiredate"), rs.getInt("point"));
				arrMember.add(member);			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		return arrMember;
	}
	
	@Override
	public ArrayList<MemberDTO> findByAddr(String addr) {
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		String sql = "select * from member where addr like ?";
		StringBuffer sbf = new StringBuffer("%");
		sbf.append(addr);
		sbf.append("%");
		ArrayList<MemberDTO> arrMember = new ArrayList<MemberDTO>();
		MemberDTO member = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, sbf.toString());
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				member = new MemberDTO(rs.getString("id"), rs.getString("pass"), rs.getString("name"),
							rs.getString("addr"), rs.getString("deptno"), rs.getDate("hiredate"), rs.getInt("point"));
				arrMember.add(member);			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		return arrMember;
	}
	
	@Override
	public MemberDTO login(String id, String pass) {
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		String sql = "select * from member where id = ? and pass = ?";
		MemberDTO member = null;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, pass);
			rs = ptmt.executeQuery();
			
			if(rs.next()) {
				member = new MemberDTO(rs.getString("id"), rs.getString("pass"), rs.getString("name"),
							rs.getString("addr"), rs.getString("deptno"), rs.getDate("hiredate"), rs.getInt("point"));		
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		return member;
	}
}
