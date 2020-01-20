package member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "memDel", urlPatterns = { "/member/delete.do" })
public class MemberDeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		//1. 요청정보 추출
		String deptNo = request.getParameter("deptno");
		response.setContentType("text/html;charset=euc-kr");
		
		//2. 비지니스 메서드 호출
		MemberDAO dao = new MemberDAO();
		int result = dao.delete(deptNo);
		
		//3. 요청재지정
		response.sendRedirect("/serverweb/member/list.do");
	}

}
