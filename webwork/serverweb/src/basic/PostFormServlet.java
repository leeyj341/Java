package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostFormServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("euc-kr");
		String id = req.getParameter("userId");
		String name = req.getParameter("userName");
		String pass = req.getParameter("passwd");
		String gender = req.getParameter("gender");
		String job = req.getParameter("job");
		String[] arrFavorite = req.getParameterValues("item");
		
		System.out.println("Customer");
		System.out.println("------------------------");
		System.out.println("���̵�: " + id);
		System.out.println("����: " + name);
		System.out.println("��й�ȣ: " + pass);
		System.out.println("����: " + gender);
		System.out.println("����: " + job);
		System.out.print("Favorites: ");
		for (String string : arrFavorite) {
			System.out.print(string + " ");
		}
	}
}
