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
		System.out.println("아이디: " + id);
		System.out.println("성명: " + name);
		System.out.println("비밀번호: " + pass);
		System.out.println("성별: " + gender);
		System.out.println("직업: " + job);
		System.out.print("Favorites: ");
		for (String string : arrFavorite) {
			System.out.print(string + " ");
		}
	}
}
