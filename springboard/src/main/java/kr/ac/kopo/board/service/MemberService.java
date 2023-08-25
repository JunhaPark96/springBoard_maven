package kr.ac.kopo.board.service;

import kr.ac.kopo.board.vo.LoginVO;
import kr.ac.kopo.board.vo.MemberVO;

public interface MemberService {
	public MemberVO loginMember(LoginVO loginVO);
	
	public void signUp(MemberVO memberVO);
}
