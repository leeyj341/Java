package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
	@RequestMapping("/test.do")
	public ModelAndView test() {
		System.out.println("컨트롤러 요청 완료");
		//공유데이터 정보와 응답뷰에 대한 정보를 담고 있는 스프링 객체
		ModelAndView mav = new ModelAndView();
		
		//공유데이터 저장
		//request.setAttribute("msg","스프링컨트롤러에서 넘긴 데이터");
		mav.addObject("msg", "스프링컨트롤러에서 넘긴 데이터");
		
		//forward할 뷰의 정보를 정의 - 기본이 forward
		mav.setViewName("test/result");
		return mav;
	}
	
}

