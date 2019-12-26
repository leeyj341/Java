package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CloseTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@70.12.115.52:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "select boardnum, id, title, content from tb_board";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
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
			//�ڿ��ݳ�
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
