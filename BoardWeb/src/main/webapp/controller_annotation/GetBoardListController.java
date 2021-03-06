package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class GetBoardListController {
	
	@RequestMapping("/getBoardList.do")
	public ModelAndView getBoardList(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		System.out.println("글 목록 검색 처리");
		
		mav.addObject("boardList", boardDAO.getBoardList(vo));     // Model일때는 이것을 실행한다.
		mav.setViewName("getBoardList.jsp");       // 그게 아니면 이것이 실행이 된다.
		return mav;
	}
}
