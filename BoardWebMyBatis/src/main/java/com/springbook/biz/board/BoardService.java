package com.springbook.biz.board;

import java.util.List;

public interface BoardService {
	
	// 글 등록
	/*public abstract*/ void insertBoard(BoardVO vo);
	
	// 글 수정
	void updateBoard(BoardVO vo);
	
	// 글 삭제
	void deleteBoard(BoardVO vo);
	
	// 글 상세 조회(1건)
	BoardVO getBoard(BoardVO vo);
	
	// 글 목록 조회(글 전체)
	List<BoardVO> getBoardList(BoardVO vo);
	
}
