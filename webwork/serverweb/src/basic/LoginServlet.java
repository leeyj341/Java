package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1.��û���� ����
		req.setCharacterEncoding("euc-kr"); // ��ȯ�ϴ� ��� �� �ϳ�
	
		String id = req.getParameter("id"); // test.html�� �±� �� name�� �ش��ϴ� ��
		String pass = req.getParameter("pass");
		
		System.out.println("���̵�: " + id);
		System.out.println("�н�����: " + pass);
	}
}
