package com.springbook.biz.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest {
	
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버를 로드 했습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", 
				"LIS", "scott12")) {
			System.out.println("커넥션을 연결했습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
