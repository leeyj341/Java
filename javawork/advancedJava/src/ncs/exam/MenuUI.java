package ncs.exam;
import java.util.Date;
import java.util.Scanner;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	CustomerDAO dao = new CustomerDAO();
	
	public void insertMenu(){
		System.out.println("*******게시글등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("비번:");
		String password = key.next();
		System.out.print("이름:");
		String name = key.next();
		System.out.print("포인트:");
		int point = key.nextInt();
		System.out.print("주소:");
		String addr = key.next();
		
	
		//여기에서 EmpDAO의 메소드를 호출하세요
		//int result = dao.insert(id, title, content);
		CustomerDTO customer = new CustomerDTO(id, password, name, point, addr);
		int result = dao.insert(customer);
		//결과처리
		if(result > 0) {
			System.out.println("게시글 등록 성공");
		} else {
			System.out.println("글 등록 실패");
		}
		
	}
	public void updateMenu(){
		System.out.println("*******게시글수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("주소:");
		String addr = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
		int result = dao.update(id, addr);
		//결과처리
		if(result > 0) {
			System.out.println("게시글 수정 성공");
		} else {
			System.out.println("글 수정 실패");
		}
	}
	public void deleteMenu(){
		System.out.println("*******게시글삭제********");
		System.out.print("아이디:");
		String id = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
		int result = dao.delete(id);
		//결과처리
		if(result > 0) {
			System.out.println("삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
	}
}


















