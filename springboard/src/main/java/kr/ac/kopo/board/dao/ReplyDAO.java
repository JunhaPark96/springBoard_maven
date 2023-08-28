package kr.ac.kopo.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.ac.kopo.board.vo.ReplyVO;

public interface ReplyDAO {
   
   public void newReply(ReplyVO replyVO); 
   public List<ReplyVO> getReplyByBoardNo(int bno);
   public void deleteReplyByNo(int replyNo);
}