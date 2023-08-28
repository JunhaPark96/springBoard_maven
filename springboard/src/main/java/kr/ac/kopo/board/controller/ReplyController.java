package kr.ac.kopo.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.board.service.ReplyService;
import kr.ac.kopo.board.vo.ReplyVO;

@Controller
public class ReplyController {
   @Autowired
   private ReplyService replyService;
   
   @ResponseBody
   @PostMapping("/reply")
   public void newReply(ReplyVO replyVO) {
      replyService.newReply(replyVO);
   }
   
   // view 필요없이 데이터만 넘길것임
   @ResponseBody
   @GetMapping("/reply/{bno}")
   public List<ReplyVO> getAllReply(@PathVariable("bno") int bno){
      System.out.println("--------------------------답글 기능-------------------");
      List<ReplyVO> replyList = replyService.getReplyByBoardNo(bno);
      for (ReplyVO vo : replyList) {
         System.out.println(vo);
      }
      return replyList;
   }
   
   @ResponseBody
   @DeleteMapping("/reply/{bno}/{replyNo}")
   public void deleteReply(@PathVariable("bno") int boardNo, 
		   @PathVariable("replyNo") int replyNo) {
      replyService.deleteReplyByNo(replyNo, boardNo);
   }
   
}