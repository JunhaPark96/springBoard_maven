package kr.ac.kopo.board.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.board.vo.BoardVO;

@Controller
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board")
	public ModelAndView getAllBoard() {
		ModelAndView mav = new ModelAndView("board/boardlist");
		List<BoardVO> boardList = boardService.getAllBoard();
		mav.addObject("boardList", boardList);
		return mav;
	}
	
	//@GetMapping("/post")
	public String getPostByNo2(@RequestParam("no") int no, Model model ) {
		BoardVO vo = boardService.getPostByNo(no);
		model.addAttribute("boardVO", vo);
		return "board/detail";
	}
	
	// http://localhost:8080/springmvc/board/숫자
	@GetMapping("/board/{no}")
	public String getPostByNo(@PathVariable("no") int no, Model model ) {
		BoardVO vo = boardService.getPostByNo(no);
		model.addAttribute("boardVO", vo);
		return "board/detail";
	}
	
	@GetMapping("/board/new")
	public String newPost(Model model) {
		BoardVO vo = new BoardVO();
		vo.setTitle("기본제목");
		model.addAttribute("boardVO", vo);
		return "board/writeForm";
	}
	@PostMapping("/board/new")
	public String newPostProcess(@Valid BoardVO vo, BindingResult br) {
		// data 관련 작업
		// boardService 일을 시킴
		// boardVO insert 명령
		
		// 유효한지 확인 후 에러 확인
		if (br.hasErrors()){
			System.out.println("null이 있음");
			return "board/writeForm";
		} else {
			boardService.createNewPost(vo);
			// /board를 찾아감
			return "redirect:/board";
		}
	}
}
