package member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class SearchController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String search = request.getParameter("search");
		System.out.println("°Ë»ö¾î : " + search);
		
		return new ModelAndView("/WEB-INF/test/index.jsp");
	}
	
}
