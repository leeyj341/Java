package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultiCheckServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("euc-kr");
		String name = req.getParameter("name");
		String addr = req.getParameter("addr");
		
		String[] arrSw = req.getParameterValues("sw");
		
		System.out.println("MultiCheck");
		System.out.println("------------------------");
		System.out.println("����: " + name);
		System.out.println("�ּ�: " + addr);

		System.out.println("������� ����Ʈ����: ");
		for (String string : arrSw) {
			System.out.println(string);
		}
	}
}
