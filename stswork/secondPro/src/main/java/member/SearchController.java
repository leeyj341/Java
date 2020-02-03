package member;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller
public class SearchController {
	@RequestMapping("/search.do")
	public ModelAndView search(String search) {
		System.out.println("검색어 : " + search);
		
		return new ModelAndView("test/index");
	}
	
}