/***********************************************************************************************
 * 회원가입 유효성 검사 - 아이디 값을 변경했을 경우
 ***********************************************************************************************/
function changeUserID() {
	$("#checkID").val("false");
	$("#btnID").val("중복 확인");
}

/***********************************************************************************************
 * 회원가입 유효성 검사 - 아이디 중복 확인
 ***********************************************************************************************/
function checkUserID() {
	// 아이디를 입력하지 않은 경우
	if ($("#USER_ID").val() == '') {
		alert("아이디를 입력해주세요");
	}
	// 아이디를 입력한 경우
	else {
		$.ajax({
			url: "/checkID",
			data: { USER_ID: $("#USER_ID").val() },
			dataType: "JSON",
			success: function(data) {
				alert("이미 사용 중인 아이디입니다.");
			},
			error: function(err) {
				alert("사용 가능한 아이디입니다.");
				
				$("#checkID").val("true");
				$("#btnID").val("확인 완료");
			}
		});
	}
}

/***********************************************************************************************
 * 회원가입
 ***********************************************************************************************/
function submitJoin() {
	// 아이디 중복 확인이 완료되지 않은 경우
	if ($("#checkID").val() == 'false') {
		alert("아이디 중복 확인을 진행해주세요.");
	}
	// 아이디 중복 확인이 완료된 경우
	else {
		// 비밀번호가 일치하지 않는 경우
		if($("#USER_PWD").val() != $("#USER_PWD_CHECK").val()) {
			alert("입력하신 비밀번호가 일치하지 않습니다.");
		}
		// 비밀번호가 일치하는 경우
		else {
			document.formJoin.submit();
		}
	}
}