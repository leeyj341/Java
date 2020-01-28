package front.fw;

import java.util.HashMap;

import member.MemberInsert;
import product.ProductList;

/*
 * FrontServlet이 넘겨준 요청 path를 가지고 실제 실행할 클래스의 객체를 만들어서 리턴하는 작업을 수행
 * 	=> 미리 요청 path별로 실행할 실제 클래스를 등록한 설정파일을 보고 객체를 찾아서 생성
 * 	   mycommand.properties파일에 등록된 요청 path를 보고 실행할 객체를 찾는다.
 * 	   xml파일이나 properties파일을 파싱하는 코드를 정리
*/
public class RequestMapping {
	//xml이나 properties파일을 파싱해서 생성해놓은 객체를 저장할 map
	//요청 path가 key, 실제실행할객체 value
	private HashMap<String, Action> actionMap = new HashMap<String, Action>();
	
	public RequestMapping() {
		//생성자 내부에서 설정파일을 파싱해서 객체로 만드는 코드가 정의되어야 한다.
		
	}

	public Action mapping(String path) {
		//매개변수로 전달된 path로 등록된 Action객체를 actionMap에서 찾아서 리턴
		//하는 코드가 정의되어야 하나... 일단 if...else로 처리
		Action action = null;
		if(path.equals("/product/list.do")) {
			action = new ProductList();
		} else if(path.equals("/member/customer/insert.do")) {
			action = new MemberInsert();
		}
		//.......
		return action;
	}

}
