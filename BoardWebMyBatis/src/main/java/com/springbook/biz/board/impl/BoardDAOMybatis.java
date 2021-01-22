package com.springbook.biz.board.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.biz.board.BoardVO;

@Repository
public class BoardDAOMybatis extends SqlSessionDaoSupport {
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Mybatis로 insertBoard() 기능 처리");
		getSqlSession().insert("BoardDAO.insertBoard", vo);
	}
	
	public void updateBoard(BoardVO vo) {
		System.out.println("===> Mybatis로 updateBoard() 기능 처리");
		getSqlSession().update("BoardDAO.updateBoard", vo);
	}
	
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Mybatis로 deleteBoard() 기능 처리");
		getSqlSession().update("BoardDAO.deleteBoard", vo);
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Mybatis로 getBoard() 기능 처리");
		return (BoardVO) getSqlSession().selectOne("BoardDAO.getBoard", vo);
	}
	
	// 2. Dynamic SQL을 사용하였을 때(board--mapping.xml)
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> Mybatis로 getBoardList() 기능 처리");
		return getSqlSession().selectList("BoardDAO.getBoardList", vo);

	}
	
	// 1. Dynamic SQL을 사용하지 않았을 때(board--mapping.xml)
//	public List<BoardVO> getBoardList(BoardVO vo) {
//		System.out.println("===> Mybatis로 getBoardList() 기능 처리");
//		return getSqlSession().selectList("BoardDAO.getBoardList", vo);
//		
//		if(vo.getSearchCondition().equals("TITLE")) {
//			return getSqlSession().selectList("BoardDAO.getBoardList_T", vo);
//		} else if(vo.getSearchCondition().equals("CONTENT")) {
//			return getSqlSession().selectList("BoardDAO.getBoardList_C", vo);
//		} else if(vo.getSearchCondition().equals("WRITER")) {
//			return getSqlSession().selectList("BoardDAO.getBoardList_W", vo);
//		}
//		return null;
//	}
}
