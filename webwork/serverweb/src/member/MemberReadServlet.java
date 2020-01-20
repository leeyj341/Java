package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "memRead", urlPatterns = { "/member/read.do" })
public class MemberReadServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		
		String id = request.getParameter("id");
		
		// 비지니스 메서드 호출
		MemberDAO dao = new MemberDAO();
		MemberDTO dto =  dao.read(id);
		
		// jsp로 넘겨 줄 데이터 공유하기
		request.setAttribute("dto", dto);
		
		// 요청재지정(forward) - 응답할 jsp 요청하기
		RequestDispatcher rd = request.getRequestDispatcher("/member/dept_read.jsp");
		rd.forward(request, response);
	}

}
