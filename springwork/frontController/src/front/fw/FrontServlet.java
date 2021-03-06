package front.fw;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 모든 요청이 FrontServlet을 통해 들어올 수 있도록 설정
@WebServlet(name="front", urlPatterns= {"*.do", "*.jsp", "*.html"})
public class FrontServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 요청 정보를 분석해서 추출 - 어떤 path로 요청할지 모르는 상태
		System.out.println("요청받기");
		System.out.println("request.getContextPath() => " + request.getContextPath());
		System.out.println("request.getRequestURI() => " + request.getRequestURI());
		
		String contextPath = request.getContextPath();
		String requestURI = request.getRequestURI();
		
		String path = requestURI.substring(contextPath.length());
		System.out.println("path => " + path);
		
		//추출한 요청 패스로 등록되어 있는 실행할 클래스 정보를 찾아오는 작업
		//RequestMapping객체에 의뢰(뭘 실행해야 하는지) => RequestMapping객체의 메서드를 호출하면 실제 실행할 객체를 찾아서 리턴
		RequestMapping mappingObj = new RequestMapping();
		Action action = mappingObj.mapping(path);
		
		//한글 인코딩
		
		//Action객체의 메서드를 호출
		action.run(request, response);
		
		//run메서드의 실행결과를 받아서 응답 view를 찾는다.
		
		//응답 view로 forward or redirect
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
