function LoginFormCheck() {
	if (frm.id.value == "") {
		alert("아이디를 입력하세요");
		frm.id.foucs();
		return false;
	}
	if (frm.pw.value == "") {
		alert("패스워드를 입력하세요");
		frm.pw.foucs();
		return false;
	}
	return true;
}

function memberFormCheck() {
	if (frm.id.value == "") {
		alert("사용할 아이디를 입력하세요");
		frm.id.focus();
		return false;
	}
	if (frm.idch.value == "unCheck") {
		alert("아이디 중복체크를 확인해주세요.");
		return false;
	}
	if (frm.pw.value == "") {
		alert("비밀번호를 입력하세요");
		frm.pw.focus();
		return false;
	}
	if (frm.pwok.value == "") {
		alert("비밀번호 확인값을 입력하세요.");
		frm.pwok.focus();
		return false;
	}
	if (frm.pw.value != frm.pwok.value) {
		alert("비밀번호를 다시 확인해주세요.");
		frm.pwok.focus();
		return false;
	}
	return true;
}
function idCheck() {
	var id = frm.id.value;
	if (id == "") {
		alert("아이디값을 입력후 확인하세요.");
		frm.id.focus();
	} else {
		window.open("idCheck.do?id=" + id, "", "width=600,height=400");
	}
}

function writeCheck() {
	if (frm.title.value == "") {
		alert("제목을 입력하세요");
		frm.title.focus();
		return false;
	}
	if (frm.contents.value == "") {
		alert("내용을 입력하세요");
		frm.contents.focus();
		return false;
	}
	return true;
}

