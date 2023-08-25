package kr.ac.kopo.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.board.dao.MemberDAO;
import kr.ac.kopo.board.vo.LoginVO;
import kr.ac.kopo.board.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public MemberVO loginMember(LoginVO loginVO) {
		return memberDAO.login(loginVO);
	}

	@Override
	public void signUp(MemberVO memberVO) {
		memberDAO.signUp(memberVO);
	}
	
}
