package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;

public class DeptDAO {
	//read
	public DeptDTO read(String deptNo) {
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "select * from mydept where deptno = ?";
		DeptDTO dto = null;
		ResultSet rs = null;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptNo);
			rs = ptmt.executeQuery();
			if(rs.next()) {
				dto = new DeptDTO(rs.getString(1),
						rs.getString(2),
						rs.getString(3), 
						rs.getString(4), 
						rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		
		return dto;
	}
	
	//삭제
	public int delete(String deptNo) {
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "delete from mydept where deptno = ?";
		int result = 0;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptNo);
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	//전체 목록 출력
	public ArrayList<DeptDTO> getDeptList() {
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "select * from mydept";
		ArrayList<DeptDTO> list = new ArrayList<DeptDTO>();
		ResultSet rs = null;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			DeptDTO dto = null;
			while(rs.next()) {
				dto = new DeptDTO(rs.getString("deptno"), 
						rs.getString("deptname"), 
						rs.getString("loc"), 
						rs.getString("tel"), 
						rs.getString("mgr"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		return list;
	}
	//부서 등록
	public int insert(DeptDTO dto) {
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "insert into mydept values(?, ?, ?, ?, ?)";
		int result = 0;
		
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dto.getDeptNo());
			ptmt.setString(2, dto.getDeptName());
			ptmt.setString(3, dto.getLoc());
			ptmt.setString(4, dto.getTel());
			ptmt.setString(5, dto.getMgr());
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
}
