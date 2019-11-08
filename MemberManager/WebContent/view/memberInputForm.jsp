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
		<div><jsp:include page="topmenu.jsp"></jsp:include></div>
		<div>
			<br>
			<c:choose>
				<c:when test="${id != null }">
					<h1>${id }님은이미등록된회원입니다.</h1>
				</c:when>
				<c:otherwise>
					<div>
						<h1>회원등록</h1>
					</div>
					<div>
						<form id="frm" name="frm" action="memInsertOk.do" method="post"
							onsubmit="return memberFormCheck();">
							<div>
								<table border="1">
									<tr>
										<th align="center" width="100">아이디</th>
										<td><input type="text" id="id" name="id" size="25">&nbsp;&nbsp;
											<button type="button" id="idch" name="idch" onclick="idCheck()" value="unCheck">중복체크</button>
										</td>
									</tr>
									<tr>
										<th align="center">이름</th>
										<td><input type="text" id="name" name="name" size="25"></td>
									</tr>
									<tr>
										<th align="center">비밀번호</th>
										<td><input type="password" id="pw" name="pw" size="25"></td>
									</tr>
									<tr>
										<th align="center">비밀번호확인</th>
										<td><input type="password" id="pwok" name="pwok"
											size="25"></td>
									</tr>
									<tr>
										<th align="center">주소</th>
										<td><input type="text" id="addr" name="addr" size="50"></td>
									</tr>
									<tr>
										<th align="center">전화번호</th>
										<td><input type="tel" id="tel" name="tel" size="25">
										</td>
									</tr>
								</table>
							</div>
							<div>
							<input type="submit" value="가입">&nbsp;&nbsp;
							<input type="reset" value="취소">
							</div>
						</form>
					</div>
				</c:otherwise>
			</c:choose>
		</div>
	</div>
</body>
</html>