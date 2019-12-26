package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedDeleteTest {
	public void delete(int boardNum) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		StringBuffer sql = new StringBuffer("delete from tb_board ");
		sql.append("where boardnum = ?");
		Connection con = null;
		PreparedStatement ptmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			ptmt = con.prepareStatement(sql.toString());
			ptmt.setInt(1, boardNum);
			int result = ptmt.executeUpdate();
			System.out.println(result + "개 행이 삭제됐습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("연결 실패: " + e.getMessage());
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
		PreparedDeleteTest obj = new PreparedDeleteTest();
		
		System.out.print("게시판 번호 : ");
		int boardNum = key.nextInt();
		obj.delete(boardNum);
	}

}
