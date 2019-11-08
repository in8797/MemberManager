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
			<h1>회 원 목 록</h1>
		</div>
		<div>
			<table border="1">
				<tr>
					<th>아이디</th>
					<th>이름</th>
					<th>가입일자</th>
					<th>주소</th>
					<th>전화</th>
				</tr>
				<c:forEach var="list" items="${list }">
					<tr>
						<td>${list.id }</td>
						<td>${list.name }</td>
						<td>${list.eDate }</td>
						<td>${list.addr }</td>
						<td>${list.tel }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>