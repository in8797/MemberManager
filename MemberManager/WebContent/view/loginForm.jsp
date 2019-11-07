<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginForm.jsp</title>
<script src="js/myJavaScript.js"></script>
</head>
<body>
	<div align="center">
		<div>
			<jsp:include page="topmenu.jsp"></jsp:include>
		</div>
		<div>
			<h1>로 그 인</h1>
		</div>
		<div>
			<form id="frm" name="frm" action="loginOk.do" method="post" onsubmit="return LoginFormCheck()">
				<div>
					<table border="1">
						<tr>
							<th align="center" width="70">아이디</th>
							<td><input type="text" id="id" name="id" size="30"></td>
						</tr>
						<tr>
							<th align="center" width="70">패스워드</th>
							<td><input type="password" id="pw" name="pw" size="30"></td>
						</tr>
					</table>
				</div>
				<div>
					<br>
					<input type="submit" value="로그인">
					<input type="reset" value="취소">
				</div>
			</form>
		</div>
	</div>
</body>
</html>