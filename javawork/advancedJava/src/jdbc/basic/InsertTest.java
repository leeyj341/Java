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
		
		//실행할 sql문
		String sql = "insert into tb_board values(board_seq.nextval,'jang','연습','연습',sysdate,0)";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공: " + con);
			// 3. sql을 실행하기 위한 객체를 생성 - 연결정보와 연결시켜야 하므로 Connection객체를 이용해서 생성
			Statement stmt = con.createStatement();
			System.out.println("SQL을 실행하기 위한 객체정보: " + stmt);
			// 4. sql 실행하기
			int result = stmt.executeUpdate(sql);
						System.out.println(result + "개 행이 삽입 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("연결 실패:");
			e.printStackTrace(); // 오류 추적
		}

	}

}
