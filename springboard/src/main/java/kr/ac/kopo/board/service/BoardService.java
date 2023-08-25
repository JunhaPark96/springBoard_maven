package kr.ac.kopo.board.service;

import java.util.List;

import kr.ac.kopo.board.vo.BoardVO;

public interface BoardService {
	public List<BoardVO> getAllBoard();
	
	public BoardVO getPostByNo(int no);
	
	public void createNewPost(BoardVO vo);
}