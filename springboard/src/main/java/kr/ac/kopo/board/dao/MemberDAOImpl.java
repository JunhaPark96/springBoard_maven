package kr.ac.kopo.board.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.board.vo.LoginVO;
import kr.ac.kopo.board.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	@Override
	public MemberVO login(LoginVO loginVO) {
		MemberVO memberVO = sqlSessionTemplate.selectOne("springboard.board.dao.MemberDAO.login", loginVO);
		return memberVO;
	}

	@Override
	public void signUp(MemberVO memberVO) {
		sqlSessionTemplate.insert("springboard.board.dao.MemberDAO.signup", memberVO);
	}
}
