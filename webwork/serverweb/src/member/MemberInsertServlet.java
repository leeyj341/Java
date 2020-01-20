package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "memInsert", urlPatterns = { "/member/insert.do" })
public class MemberInsertServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		String deptNo = request.getParameter("deptno");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String addr = request.getParameter("addr");
		String grade = request.getParameter("grade");
		String point = request.getParameter("point");
		
		MemberDTO dto = new MemberDTO(id, pass, name, addr, deptNo, grade, Integer.parseInt(point));
		MemberDAO dao = new MemberDAO();
		int result = dao.insert(dto);

		request.setAttribute("result", result);
		
		response.setContentType("text/html;charset=euc-kr");
		
		//3. 응답화면으로 요청재지정
		RequestDispatcher rd = request.getRequestDispatcher("/dept/insertResult.jsp");
		rd.forward(request, response);
	}

}
