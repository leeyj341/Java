package multi.erp.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//emp테이블에서 작업하는 모든 내용에 대한 컨트롤러
@Controller
public class EmpController {
	@Autowired
	EmpService service;
	//로그인 페이지
	@RequestMapping(value="/emp/login.do", method=RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	//로그인 처리를 위한 요청
	//- 매개변수가 VO객체 :
	//스프링 MVC내부의 클래스인 DispatcherServlet에서 자동으로 입력된 
	//파라미터들을 추출해서
	//VO객체를 만들고 setter메서드의 값으로 전달한다.
	@RequestMapping(value="/emp/login.do", method=RequestMethod.POST)
	public ModelAndView login(MemberVO loginUserInfo) {
		// vo => db연동 후 로그인 된 사용자의 정보
		// loginUserInfo => 로그인하기 위해서 사용자가 입력한 데이터를 VO로 만든 객체
		ModelAndView mav = new ModelAndView();
		MemberVO vo = service.login(loginUserInfo);
		System.out.println(vo);
		mav.addObject("user", vo);
		mav.setViewName("index");
		
		return mav;
	}
}
