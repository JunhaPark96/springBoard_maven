package kr.ac.kopo.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.board.vo.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO{
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<BoardVO> getAllPost() {
		// namespace + id
		List<BoardVO> boardList = sqlSessionTemplate.selectList("springboard.board.dao.BoardDAO.selectAll");
		return boardList;
	}

	@Override
	public BoardVO getPostByNo(int no) {
		BoardVO vo = sqlSessionTemplate.selectOne("springboard.board.dao.BoardDAO.selectByNo", no);
		return vo;
	}

	@Override
	public void createNewPost(BoardVO vo) {
		// sqlSessionTemplate은 commit 자동
		sqlSessionTemplate.insert("springboard.board.dao.BoardDAO.insertNewPost", vo);
	}

	@Override
	public void increaseCount(int no) {
		sqlSessionTemplate.update("springboard.board.dao.BoardDAO.increaseCount", no);
		
	}

	@Override
	public void decreaseCount(int no) {
		sqlSessionTemplate.update("springboard.board.dao.BoardDAO.decreaseCount", no);
	}
}
