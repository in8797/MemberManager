<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
				<h1>공 지 사 항</h1>
			</div>
		<c:choose>
			<c:when test="${lenght != 0}">
				<div>
					<table border="1">
						<tr>
							<th>작성자</th>
							<th>제목</th>
							<th>내용</th>
							<th>작성일자</th>
							<th>조회수</th>
						</tr>
						<c:forEach var="list" items="${list }">
							<tr>
								<td>${list.id }</td>
								<td>${list.title }</td>
								<td>${list.contents }</td>
								<td>${list.nDate }</td>
								<td>${list.hit }</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</c:when>
			<c:otherwise>
				<div>
					<h1>내용이 없습니다</h1>
				</div>
			</c:otherwise>
		</c:choose>
	</div>
</body>
</html>