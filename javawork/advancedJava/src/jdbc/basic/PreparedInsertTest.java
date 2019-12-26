package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedInsertTest {
	public void insert(String id, String title, String content) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		//������ sql��
		/*String sql = "insert into tb_board values(board_seq.nextval,'" + 
						id + "','" + title + "','" + content + "',sysdate,0)";*/
		//���� sql : PreparedStatement���
		String sql = "insert into tb_board values(board_seq.nextval, ?, ?, ?, sysdate, 0)";
		
		Connection con = null;
		PreparedStatement ptmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, title);
			ptmt.setString(3, content);
			int result = ptmt.executeUpdate();
			System.out.println(result + "�� �� ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("���� ����:");
			e.printStackTrace(); // ���� ����
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
		PreparedInsertTest obj = new PreparedInsertTest();
		Scanner key = new Scanner(System.in);
		
		System.out.println("********* �Խñ� ��� *********");
		System.out.print("���̵� : ");
		String id = key.next();
		System.out.print("���� : ");
		String title = key.next();
		System.out.print("���� : ");
		String content = key.next();
		
		obj.insert(id, title, content);
	}

}
