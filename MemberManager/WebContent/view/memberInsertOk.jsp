<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/myJavaScript.js"></script>
</head>
<body>
	<div align="center">
		<div><jsp:include page="topmenu.jsp"></jsp:include></div>

		<div>
			<c:choose>
				<c:when test="${pass!=0}">
					<h1>회원가입이 성공했습니다</h1>
					<div>
						<br>
						<button type="button" onclick="location.href='index.do'">확인</button>
					</div>
				</c:when>
				<c:otherwise>
					<h1>회원가입이 실패하였습니다</h1>
					<div>
						<br>
						<button type="button" onclick="location.href='memberInput.do'">확인</button>
					</div>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</body>
</html>