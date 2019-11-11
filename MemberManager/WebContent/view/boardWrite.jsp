<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
			<h1>글 작성</h1>
		</div>
		<div>
			<form id="frm" name="frm" action="boardWriteOk.do" method="post"
				onsubmit="return writeCheck();">
				<div>
					<table>
						<tr>
							<th>작성자</th>
							<td><input type="text" id="writer" name="writer"></td>
						</tr>
						<tr>
							<th>제목</th>
							<td><input type="text" id="title" name="title"></td>
						</tr>
						<tr>
							<th>내용</th>
							<td><textarea id="contents" name="contents" rows="10"
									cols="40"></textarea></td>
						</tr>
					</table>
				</div>
				<div>
					<input type="submit" value="등록">&nbsp;&nbsp; <input
						type="reset" value="취소">
				</div>
			</form>
		</div>
	</div>
</body>
</html>