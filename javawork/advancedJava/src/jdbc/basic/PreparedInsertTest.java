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
		
		//실행할 sql문
		/*String sql = "insert into tb_board values(board_seq.nextval,'" + 
						id + "','" + title + "','" + content + "',sysdate,0)";*/
		//동적 sql : PreparedStatement방식
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
			System.out.println(result + "개 행 삽입 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
			System.out.println("연결 실패:");
			e.printStackTrace(); // 오류 추적
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
		
		System.out.println("********* 게시글 등록 *********");
		System.out.print("아이디 : ");
		String id = key.next();
		System.out.print("제목 : ");
		String title = key.next();
		System.out.print("내용 : ");
		String content = key.next();
		
		obj.insert(id, title, content);
	}

}
