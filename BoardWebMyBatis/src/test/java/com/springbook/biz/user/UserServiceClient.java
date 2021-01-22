package com.springbook.biz.user;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserServiceClient {
	
	public static void main(String[] args) {
		// 1. Spring 컨테이너 구동
		// AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext2.xml");
		
		// 2. Spring 컨테이너가 UserServiceImpl 객체를 LookUp(룩업)함. ----> IoC 개념에 의해서.
		UserService userService = (UserService) container.getBean("userService");
		
		// 3. 사용자 등록
		UserVO vo = new UserVO();
		vo.setId("korea17");     // Oracle에서 id를 기본키로 주었기 때문에 안에 있는 데이터에서 숫자를 계속 바꾸면서 실행을 하면된다.
		vo.setPassword("1234");
		vo.setName("최홍석");
		vo.setRole("관리자");
		userService.insertUser(vo);     // 등록을 한다.
		
		// 4. 사용자 검색(1명) -> 로그인 처리
		UserVO user = userService.getUser(vo);
		if(user != null) {
			System.out.println(user.getRole() + ": " + user.getName() + "님 환영합니다.");
		} else {
			System.out.println("로그인 실패");
		}
		
		container.close();
	}
}
