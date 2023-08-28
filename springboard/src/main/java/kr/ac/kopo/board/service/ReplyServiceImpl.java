package kr.ac.kopo.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.kopo.board.dao.ReplyDAO;
import kr.ac.kopo.board.vo.ReplyVO;

@Service
public class ReplyServiceImpl implements ReplyService{
   @Autowired
   private ReplyDAO replyDAO;
   
   @Override
   public void newReply(ReplyVO replyVO) {
      // 1. 댓글 수 1 증가, board_no 받아서 count + 1
      replyDAO.newReply(replyVO);
   }
   @Override
   public List<ReplyVO> getReplyByBoardNo(int bno){
      List<ReplyVO> replyList = replyDAO.getReplyByBoardNo(bno);
      return replyList;
   }
   @Override
   public void deleteReplyByNo(int replyNo, int boardNo) {
	   
      replyDAO.deleteReplyByNo(replyNo);
   }

}