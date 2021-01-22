<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ page import ="java.util.List"%>
<%@ page import ="com.springbook.biz.board.impl.BoardDAO"%>
<%@ page import ="com.springbook.biz.board.BoardVO"%> --%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%-- <%
	// 세션에 저장된 글 목록을 꺼낸다.
	List<BoardVO> boardList = (List) session.getAttribute("boardList");     // DB로 처리되는 값을 받기만 한다.
%> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="message.board.list.mainTitle"/></title>
</head>
<body>
<div align ='center'>
<h1><spring:message code="message.board.list.mainTitle"/></h1>
<h3>${userName }<spring:message code="message.board.list.welcomeMsg"/>...<a href="logout.do"><spring:message code="message.board.list.logout"/></a></h3>

<form action="getBoardList.do" method="post">
<table border="1" cellpadding="0" cellspacing="0" width="900">
	<tr>
		<td align="right">
			<select name="searchCondition">
			<c:forEach var="option" items="${conditionMap }">
				<option value="${option.value }">${option.key }</option>
			</c:forEach>
			</select>
			<input type="text" name="searchKeyword" />
			<input type="submit" value="<spring:message code="message.board.list.search.condition.btn"/>"/>
		</td>
	</tr>
</table>
</form>

<table border="1" cellpadding="0" cellspacing="0" width="900">
<tr>
	<th bgcolor="orange" width="10%"><spring:message code="message.board.list.table.head.seq"/></th>
	<th bgcolor="orange" width="45%"><spring:message code="message.board.list.table.head.title"/></th>
	<th bgcolor="orange" width="20%"><spring:message code="message.board.list.table.head.writer"/></th>
	<th bgcolor="orange" width="15%"><spring:message code="message.board.list.table.head.regDate"/></th>
	<th bgcolor="orange" width="10%"><spring:message code="message.board.list.table.head.cnt"/></th>
</tr>

<c:forEach var="board" items="${boardList }">
<tr>
	<td align="center">${board.seq }</td>
	<td align="left"><a href="getBoard.do?seq=${board.seq }">&nbsp;${board.title }</a></td>
	<td align ="center">${board.writer }</td>
	<td align="center"><fmt:formatDate value="${board.regDate }" pattern="yyyy-MM-dd a"/> </td>
	<td align="center">${board.cnt }</td>
</tr>
</c:forEach>
</table>
<br>
<a href="insertBoard.jsp"><spring:message code="message.board.list.link.insertBoard"/></a>
</div>
</body>
</html>