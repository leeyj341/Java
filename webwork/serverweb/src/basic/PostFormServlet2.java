package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//������̼�: �����Ϸ����� � ������ �� ������ ������ ��ȣ�� ���ؼ� ����� �� �ְ� �׷����� �����Ϸ����� �����ϰ� �˷��� �� �ִ�
@WebServlet(name = "mypost2", urlPatterns = { "/mypost2.do" })
public class PostFormServlet2 extends HttpServlet {
	//����� POST����̱� ������ ���⼭ �ٷ� ������ �ϸ� 405������ �߻��Ѵ�.
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		
		//��û��������
		String id = request.getParameter("userId");
		String name = request.getParameter("userName");
		String pass = request.getParameter("passwd");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String[] arrFavorite = request.getParameterValues("item");
		
		//���䳻���� ���� - �̰� ��û���� ������ �������� ���� ������ �������� �����ϴ� �ų�
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h1>������</h1>");
		pw.print("<h3>���̵�: " + id + "</h3>");
		pw.print("<h3>����: " + name + "</h3>");
		pw.print("<h3>Favorite:</h3>");
		for (String string : arrFavorite) {
			pw.print(string + " ");
		}
		
		pw.print("</body>");
		pw.print("</html>");
	}

}
