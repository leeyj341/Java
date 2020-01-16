package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//어노테이션: 컴파일러에게 어떤 동작을 할 것인지 간단한 기호를 통해서 명시할 수 있고 그로인해 컴파일러에게 간단하게 알려줄 수 있다
@WebServlet(name = "mypost2", urlPatterns = { "/mypost2.do" })
public class PostFormServlet2 extends HttpServlet {
	//현재는 POST방식이기 때문에 여기서 바로 싨행을 하면 405에러가 발생한다.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		//요청정보추출
		String id = request.getParameter("userId");
		String name = request.getParameter("userName");
		String pass = request.getParameter("passwd");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String[] arrFavorite = request.getParameterValues("item");
		
		//응답내용을 생성 - 이게 요청받은 정보를 바탕으로 새로 열리는 페이지를 설정하는 거네
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h1>고객정보</h1>");
		pw.print("<h3>아이디: " + id + "</h3>");
		pw.print("<h3>성명: " + name + "</h3>");
		pw.print("<h3>Favorite:</h3>");
		for (String string : arrFavorite) {
			pw.print(string + " ");
		}
		
		pw.print("</body>");
		pw.print("</html>");
	}

}
