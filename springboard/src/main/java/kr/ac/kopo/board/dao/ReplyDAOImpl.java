package kr.ac.kopo.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.board.vo.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO{
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public void newReply(ReplyVO replyVO) {
		sqlSessionTemplate.insert("springboard.board.reply.ReplyDAO.insertReply", replyVO);
	}

	@Override
	public List<ReplyVO> getReplyByBoardNo(int bno) {
		List<ReplyVO> replyList = sqlSessionTemplate.selectList("springboard.board.reply.ReplyDAO.selectByBoardNo", bno);
		return replyList;
	}

	@Override
	public void deleteReplyByNo(int replyNo) {
		sqlSessionTemplate.delete("springboard.board.reply.ReplyDAO.deleteReplyByNo", replyNo);
		
	}

}
