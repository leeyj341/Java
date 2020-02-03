package multi.erp.emp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	public ModelAndView login(MemberVO loginUserInfo, HttpServletRequest request) {
		// vo => db연동 후 로그인 된 사용자의 정보
		// loginUserInfo => 로그인하기 위해서 사용자가 입력한 데이터를 VO로 만든 객체
		ModelAndView mav = new ModelAndView();
		MemberVO vo = service.login(loginUserInfo);
		System.out.println(vo);
		//로그인한 사용자의 정보를 세션에 저장하는 작업
		//세션을 사용하기 위해서 매개변수에 HttpServletRequest를 정의
		// 1. 세션을 생성
		//	=> getSession()을 이용해서 세션을 생성
		//	=> 무조건 생성해서 리턴 (처음 세션을 만들때 사용)
		
		String viewName = "";
		if(vo != null) {
			// 로그인 성공 시
			HttpSession ses =request.getSession();
			// 2. 세션에 데이터 공유
			ses.setAttribute("user", vo);
			viewName = "index";
		} else {
			viewName = "emp/login";
		}
		
		//mav.addObject("user", vo);	// 기본은 리퀘스트에 저장
		System.out.println(vo.toString());
		mav.setViewName(viewName);
		
		return mav;
	}
	
	@RequestMapping("emp/logout.do") 
	public String logout(HttpSession session) {
		//로그아웃 처리를 위해 매개변수로 session을 받도록 처리
		//사용하던 세션객체가 있으면 사용하던 세션 객체가 전달된다.
		if(session != null ) {
			//null이 아니라 세션이 존재함ㄴ 세션객체를 해제
			session.invalidate();
		}
		return "redirect:/index.do";
	}
}
