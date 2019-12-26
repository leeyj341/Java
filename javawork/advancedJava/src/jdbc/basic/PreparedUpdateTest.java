package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedUpdateTest {
	public void update(String id, int boardNum) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		String sql = "update tb_board set id = ? where boardnum = ?";
		
		Connection con = null;
		PreparedStatement ptmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setInt(2, boardNum);
			int result = ptmt.executeUpdate();
			System.out.println(result + "�� ���� �����ƽ��ϴ�.");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("���� ����: " + e.getMessage());
		} finally {
			try {
				if(ptmt != null) ptmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		PreparedUpdateTest obj = new PreparedUpdateTest();
		
		System.out.print("���̵� : ");
		String id = key.next();
		System.out.print("�Խ��� ��ȣ : ");
		int boardNum = key.nextInt();
		obj.update(id, boardNum);
	}

}
