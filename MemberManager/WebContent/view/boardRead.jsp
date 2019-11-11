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
			<h1>자유게시판 세부글 읽기</h1>
		</div>
		<div>
			<table>
				<tr>
					<th>글 세부 내역</th>
				</tr>
			</table>
		</div>
			<div>
		<c:if test="${id == dto.userId }">
				<br>
				<button type="button" onclick="location.href='boardEdit.do'">글 수정</button>&nbsp;&nbsp;
				<button type="button" onclick="location.href='boardDelete.do'">글 삭제</button>&nbsp;&nbsp;
		</c:if>
				<button type="button" onclick="location.href='boardList.do'">글 목록</button>
			</div>
	</div>
</body>
</html>