package kr.ac.kopo.form;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value="/member")
@Controller
public class MemberController {
		
//	핸들러 생성
	@GetMapping("/joinForm")
	public String joinForm() {
		return "member/joinForm";
	}
	
//	@PostMapping("/memberInfo")
	public String showInfo(HttpServletRequest request) {
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		MemberVO member = new MemberVO(id, passwd);
		request.setAttribute("member", member);
		return "member/memberInfo";
	}
//	@PostMapping("/memberInfo")
	public String showInfo2(HttpServletRequest request,
			@RequestParam("id") String id2, 
			@RequestParam("passwd") String passwd2
			) {
		
		MemberVO member = new MemberVO();
		member.setId(id2);
		member.setPasswd(passwd2);
		request.setAttribute("member", member);
		return "member/memberInfo";
	}
//	@PostMapping("/memberInfo")
	public String showInfo3(HttpServletRequest request,
			// form의 name이 같으면 requestParam 생략 가능
			String id,
			String passwd
			) {
		
		MemberVO member = new MemberVO(id, passwd);
		request.setAttribute("member", member);
		return "member/memberInfo";
	}
//	@PostMapping("/memberInfo")
	public String showInfo4(MemberVO member) {
		System.out.println(member.getId() + " : " + member.getPasswd());
		
		return "member/memberInfo";
	}
//	@PostMapping("/memberInfo")
	public String showInfo5(@ModelAttribute("member") MemberVO member) {
		System.out.println(member.getId() + " : " + member.getPasswd());
		return "member/memberInfo";
	}
	@PostMapping("/memberInfo")
	public ModelAndView showInfo6(MemberVO member) {
//		@ModelAttribute("memberVO") default로 생략되어 있음
		ModelAndView mav = new ModelAndView("member/memberInfo"); // jsp 정보
//		mav.setViewName("member/memberInfo");
		mav.addObject("member", member); // 외부 데이터 등록
		return mav;
	}
}
