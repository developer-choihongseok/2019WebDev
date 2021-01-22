<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ page import ="com.springbook.biz.board.impl.BoardDAO"%>
<%@ page import ="com.springbook.biz.board.BoardVO"%> --%>

<%-- <%
	// 세션에 저장된 게시글 정보를 꺼낸다.
	BoardVO board = (BoardVO) session.getAttribute("board");
%> --%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="message.board.detail.mainTitle" /></title>
</head>
<body>
<div align='center'>
<h1><spring:message code="message.board.detail.mainTitle" /></h1>
<a href="logout.do">Log-out</a>
<hr>

<form action="updateBoard.do" method="post">
<input type="hidden" name="seq" value="${board.seq }">
<table border="1" cellpadding="0" cellspacing="0">
	<tr>
		<td bgcolor="orange" width="70"><spring:message code="message.board.detail.Title" /></td>
		<td align="left"><input name="title" type="text" value="${board.title }"/></td>
	</tr>
	<tr>
		<td bgcolor="orange"><spring:message code="message.board.detail.writer" /></td>
		<td align="left">${board.writer }</td>
	</tr>
	<tr>
		<td bgcolor="orange"><spring:message code="message.board.detail.content" /></td>
		<td align="left"><textarea name="content" cols="40" rows="10">${board.content }</textarea></td>
	</tr>
	<tr>
		<td bgcolor="orange"><spring:message code="message.board.detail.regDate" /></td>
		<td align="left">${board.regDate }</td>
	</tr>
	<tr>
		<td bgcolor="orange"><spring:message code="message.board.detail.cnt" /></td>
		<td align="left">${board.cnt }</td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<input type="submit" value="<spring:message code="message.board.detail.updateBtn" />"/>
		</td>
	</tr>
</table>
</form>
<hr>
<a href="insertBoard.jsp"><spring:message code="message.board.detail.link.insertBoard" /></a>&nbsp;&nbsp;&nbsp;
<a href="deleteBoard.do?seq=${board.seq }"><spring:message code="message.board.detail.link.deleteBoard" /></a>&nbsp;&nbsp;&nbsp;
<a href="getBoardList.do"><spring:message code="message.board.detail.link.boardList" /></a>
</div>
</body>
</html>