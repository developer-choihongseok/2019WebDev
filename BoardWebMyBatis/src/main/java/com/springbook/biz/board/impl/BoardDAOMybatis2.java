package com.springbook.biz.board.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

@Repository
public class BoardDAOMybatis2 {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Mybatis2로 insertBoard() 기능 처리");
		mybatis.insert("BoardDAO.insertBoard", vo);
	}
	
	public void updateBoard(BoardVO vo) {
		System.out.println("===> Mybatis2로 updateBoard() 기능 처리");
		mybatis.update("BoardDAO.updateBoard", vo);
	}
	
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Mybatis2로 deleteBoard() 기능 처리");
		mybatis.delete("BoardDAO.deleteBoard", vo);
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Mybatis2로 getBoard() 기능 처리");
		return (BoardVO) mybatis.selectOne("BoardDAO.getBoard", vo);
	}
	
	// 2. Dynamic SQL을 사용하였을 때(board--mapping.xml)
	// 글 목록 조회(전체)
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> Mybatis2로 getBoardList() 기능 처리");
		return mybatis.selectList("BoardDAO.getBoardList", vo);
	}
	
	// 1. Dynamic SQL을 사용하지 않았을 때
	// 글 목록 조회(전체)
//	public List<BoardVO> getBoardList(BoardVO vo) {
//		System.out.println("===> Mybatis2로 getBoardList() 기능 처리");
//		return mybatis.selectList("BoardDAO.getBoardList", vo);
//		
//		if(vo.getSearchCondition().equals("TITLE")) {
//			return mybatis.selectList("BoardDAO.getBoardList_T", vo);
//		} else if(vo.getSearchCondition().equals("CONTENT")) {
//			return mybatis.selectList("BoardDAO.getBoardList_C", vo);
//		} else if(vo.getSearchCondition().equals("WRITER")) {
//			return mybatis.selectList("BoardDAO.getBoardList_W", vo);
//		}
//		return null;
//	}
}
