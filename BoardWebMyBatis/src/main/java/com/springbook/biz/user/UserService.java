package com.springbook.biz.user;

public interface UserService {
	
	// 회원 등록
	void insertUser(UserVO vo);
	
	// 회원 검색
	/*public*/UserVO getUser(UserVO vo);
	
}
