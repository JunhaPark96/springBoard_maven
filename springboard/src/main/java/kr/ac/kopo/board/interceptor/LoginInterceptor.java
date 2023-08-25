package kr.ac.kopo.board.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.kopo.board.vo.MemberVO;

@Component
public class LoginInterceptor implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println(handler);
		System.out.println("서블릿 Path = " + request.getServletPath());
		System.out.println("context Path = " +request.getContextPath());
		System.out.println("쿼리 스트링 = " + request.getQueryString());
		System.out.println("URI Path = " + request.getRequestURI());
		
		System.out.println("preHandle 로그인 체크 동작");
		HttpSession session = request.getSession();
		MemberVO memberVO = (MemberVO) session.getAttribute("currentMember");
		if (memberVO == null) { // 로그인 안했으면
			System.out.println("memberVO is null");
			response.sendRedirect(request.getContextPath()+"/login"); // 스프링보드의 로그인으로 가라
			return false;
		} else { // 로그인 이미 한 경우
			System.out.println("memberVO 로그인 했음");
			return true;
		}
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
}
