package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedSelectTest {
	public void select() {
		String url = "jdbc:oracle:thin:@70.12.115.52:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "select boardnum, id, title, content from tb_board";
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			System.out.println("rs: " + rs);
			//ResultSet�� ���ڵ尡 �����ϴ� ���� �ݺ����� ����
			//���ڵ带 ��ȸ�ϱ� ���ؼ��� ���ڵ尡 �� ���� �ݵ�� Ŀ���� �̵����Ѿ� �Ѵ�.
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.println(rs.getString("content") + "\t");
				//System.out.print(rs.getDate(5) + "\t");
				//System.out.println(rs.getInt(6));
			}
		
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("���� ����: " + e.getMessage());
		} finally {
			try {
				if(rs != null) rs.close();
				if(ptmt != null) ptmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		PreparedSelectTest obj = new PreparedSelectTest();
		obj.select();
	}

}
