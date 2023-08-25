package kr.ac.kopo.board.dao;

import kr.ac.kopo.board.vo.LoginVO;
import kr.ac.kopo.board.vo.MemberVO;

public interface MemberDAO {
	public MemberVO login(LoginVO loginVO);
	
	public void signUp(MemberVO memberVO);
}
