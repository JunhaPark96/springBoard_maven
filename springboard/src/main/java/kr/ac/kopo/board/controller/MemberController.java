package kr.ac.kopo.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import kr.ac.kopo.board.service.MemberService;
import kr.ac.kopo.board.vo.LoginVO;
import kr.ac.kopo.board.vo.MemberVO;

// annotation으로 session 관리
@SessionAttributes("currentMember")
@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/login")
	public String loginForm(Model model) {
		model.addAttribute("loginVO", new LoginVO());
		System.out.println("로그인페이지 이동");
		return "member/loginForm";
	}
	
	@PostMapping("/login")
	public String loginProcess(@Valid LoginVO loginVO, Errors errors, Model model, HttpServletRequest request, HttpSession session) {
		if (errors.hasErrors()) {
			System.out.println("로그인 실패");
			return "member/loginForm";
		} else {
			MemberVO memberVO = memberService.loginMember(loginVO);
			if (memberVO == null) {
				System.out.println("id와 비밀번호가 틀렸슴");
				model.addAttribute("msg", "id 또는 password를 확인해주세요");
				return "member/loginForm";
			} else {
				System.out.println("로그인 성공");
				System.out.println(memberVO);
				// session 등록
//				session.setAttribute("currentMember", memberVO);
				// model에 등록한 것 중에 session으로 올려줌 - spring이 해줌
				model.addAttribute("currentMember", memberVO);
				
				String dest = (String)session.getAttribute("dest");
				if (dest == null) {
					// 바로 로그인 누르는 경우
					return "redirect:/";
					// 메인 페이지로 이동
				} else {
					// 로그인이 필요한 페이지를 들렸다 오는경우
					return "redirect:" +dest;
				}
				
			}
			
		}
	}
	
	@GetMapping("/signup")
	public String signUpForm(Model model) {
		model.addAttribute("memberVO", new MemberVO());
		System.out.println("회원가입 이동");
		return "member/signupForm";
	}
	
	@PostMapping("/signup")
	public String signUpProcess(@Valid MemberVO memberVO, Errors errors, Model model) {
		if (errors.hasErrors()) {
			System.out.println("로그인 실패");
			return "member/signupForm";
		} else {
			memberService.signUp(memberVO);
			if (memberVO == null) {
				System.out.println("id와 비밀번호가 틀렸슴");
				model.addAttribute("msg", "id 또는 password를 확인해주세요");
				return "member/signupForm";
			} else {
				System.out.println("로그인 성공");
				System.out.println(memberVO);
				return "redirect:/board";
				
			}
			
		}
	}
	
//	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	@GetMapping("logout")
	public String logout2(SessionStatus sessionStatus) {
		sessionStatus.setComplete(); // @SessionAttributes에 등록되어 있는 변수를 만료 시킴
		return "redirect:/";
	}
}
