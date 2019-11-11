<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<div>
			<jsp:include page="topmenu.jsp"></jsp:include>
		</div>
		<div>
			<h1>자유게시판 목록</h1>
		</div>
		<div>
			<table border="1">
				<tr>
					<th>순번</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일자</th>
					<th>조회수</th>
				</tr>
				<c:forEach var="list" items="${list }">
					<tr>
						<td>${list.id }</td>
						<td>${list.title }</td>
						<td>${list.writer }</td>
						<td>${list.wDate }</td>
						<td>${list.hit }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<c:if test="${id != null }">
			<div>
				<br>
				<button type="button" onclick="location.href='boardWrite.do'">글쓰기</button>
			</div>
		</c:if>
	</div>
</body>
</html>