package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "calc", urlPatterns = { "/calc.do" })
public class CalcServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//1. ��û���� ���
		req.setCharacterEncoding("euc-kr");
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		String method = req.getParameter("method");
		
		//2. �����Ͻ� �޼��� ȣ��
		CalcLogic logic = new CalcLogic();
		int result = logic.calc(num1, method, num2);
		
		//3. ����ȭ�� ����
		resp.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = resp.getWriter();
		
		pw.print("<h1>�����</h1>");
		pw.print("<h3>num1�� " + num1 + "�� num2�� " + num2 + "��<br/>������ ����� " + result + "�Դϴ�.</h3>");
	}
}
