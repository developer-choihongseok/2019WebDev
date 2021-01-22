package com.springbook.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.common.Log4jAdvice;
import com.springbook.biz.common.LogAdvice;

@Service("boardService")     // @Service는 비즈니스 로직을 처리할 때 쓴다.
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAOMybatis2 boardDAO;
//	private BoardDAOMybatis boardDAO;
//	private BoardDAOSpring2 boardDAO;
//	private BoardDAOSpring boardDAO;
//	private BoardDAO boardDAO;
	
	@Override
	public void insertBoard(BoardVO vo) {     // 핵심 관심사 -> 사용자의 요청에 따라 실제로 수행되는 핵심 비즈니스 로직.
		// 1. after-throwing 테스트(책에 있는 내용)
//		if(vo.getSeq() == 0) {
//			//throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
//			throw new NumberFormatException("0번 글은 등록할 수 없습니다.");
//		}
		
		// 2. after-throwing 테스트
//		if(vo.getWriter().equals("최홍석")) {
//			throw new IllegalArgumentException("최홍석님은 글을 등록할 수 없습니다.");
//		}
			
		boardDAO.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {     // 핵심 관심사
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {     // 핵심 관심사
		boardDAO.deleteBoard(vo);
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {     // 핵심 관심사
		return boardDAO.getBoard(vo);
	}

	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {     // 핵심 관심사
		return boardDAO.getBoardList(vo);
	}
	
}
