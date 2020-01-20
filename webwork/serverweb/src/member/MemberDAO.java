package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;

public class MemberDAO {
		//read
		public MemberDTO read(String id) {
			Connection con = null;
			PreparedStatement ptmt = null;
			String sql = "select * from member where id = ?";
			MemberDTO dto = null;
			ResultSet rs = null;
			try {
				con = DBUtil.getConnect();
				ptmt = con.prepareStatement(sql);
				ptmt.setString(1, id);
				rs = ptmt.executeQuery();
				if(rs.next()) {
					System.out.println("dao=>"+id);
					dto = new MemberDTO(rs.getString(1),
							rs.getString(2),
							rs.getString(3), 
							rs.getString(4), 
							rs.getString(5),
							rs.getString(6),
							rs.getInt(7));
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
			String sql = "delete from member where deptno = ?";
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
		public ArrayList<MemberDTO> getMemberList() {
			Connection con = null;
			PreparedStatement ptmt = null;
			String sql = "select * from member";
			ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
			ResultSet rs = null;
			
			try {
				con = DBUtil.getConnect();
				ptmt = con.prepareStatement(sql);
				rs = ptmt.executeQuery();
				MemberDTO dto = null;
				while(rs.next()) {
					dto = new MemberDTO(rs.getString("id"), 
							rs.getString("pass"), 
							rs.getString("name"), 
							rs.getString("addr"), 
							rs.getString("deptNo"),
							rs.getString("grade"),
							rs.getInt("point"));
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
		public int insert(MemberDTO dto) {
			Connection con = null;
			PreparedStatement ptmt = null;
			String sql = "insert into member values(?, ?, ?, ?, ?, ?, ?)";
			int result = 0;
			
			try {
				con = DBUtil.getConnect();
				ptmt = con.prepareStatement(sql);
				ptmt.setString(1, dto.getId());
				ptmt.setString(2, dto.getPass());
				ptmt.setString(3, dto.getName());
				ptmt.setString(4, dto.getAddr());
				ptmt.setString(5, dto.getDeptNo());
				ptmt.setString(6, dto.getGrade());
				ptmt.setInt(7, dto.getPoint());
				result = ptmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBUtil.close(null, ptmt, con);
			}
			return result;
		}
}
