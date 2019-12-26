package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		//������ sql��
		String sql = "insert into tb_board values(board_seq.nextval,'jang','����','����',sysdate,0)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("���� ����: " + con);
			// 3. sql�� �����ϱ� ���� ��ü�� ���� - ���������� ������Ѿ� �ϹǷ� Connection��ü�� �̿��ؼ� ����
			Statement stmt = con.createStatement();
			System.out.println("SQL�� �����ϱ� ���� ��ü����: " + stmt);
			// 4. sql �����ϱ�
			int result = stmt.executeUpdate(sql);
						System.out.println(result + "�� ���� ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("���� ����:");
			e.printStackTrace(); // ���� ����
		}

	}

}
