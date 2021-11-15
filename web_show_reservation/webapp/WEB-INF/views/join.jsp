<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>JOIN</title>
	<link rel="stylesheet" href="/css/common.css">
	<link rel="stylesheet" href="/css/include.css">
	<link rel="stylesheet" href="/css/join.css">
</head>
<body>
	<%@ include file="/WEB-INF/includes/header.jsp" %>
	
	<%@ include file="/WEB-INF/includes/mainmenu.jsp" %>
	
	<div id="wrapJoin">
		<div class="divJoinTitle">방문을 환영합니다!</div>
		<div id="divJoin">
			<form method="POST" action="/join">
				<div>
					<p class="pJoin">아이디</p>
					<input class="inputJoin" type="text" name="USER_ID">
					<input class="buttonJoin" type="button" value="중복 확인">
				</div>
				<div>
					<p class="pJoin">비밀번호</p>
					<input class="inputJoin" type="password" name="USER_PWD">
					<p class="pJoin"></p>
				</div>
				<div>
					<p class="pJoin">비밀번호 확인</p>
					<input class="inputJoin" type="password" name="USER_PWD_CHECK">
					<p class="pJoin"></p>
				</div>
				<div>
					<p class="pJoin">이름</p>
					<input class="inputJoin" type="text" name="USER_NAME">
					<p class="pJoin"></p>
				</div>
				<div>
					<p class="pJoin">전화번호</p>
					<input class="inputJoin" type="text" name="USER_PHONE">
					<p class="pJoin"></p>
				</div>
				<div>
					<p class="pJoin">생년월일</p>
					<select class="selectJoin" name="USER_BIRTH_YEAR">
						<option value=""></option>
					</select>
					<select class="selectJoin" name="USER_BIRTH_MONTH">
						<option value=""></option>
					</select>
					<select class="selectJoin" name="USER_BIRTH_DAY">
						<option value=""></option>
					</select>
					<p class="pJoin"></p>
				</div>
				<div>
					<p class="pJoin">성별</p>
					<label class="labelJoin"><input type="radio" name="USER_GENDER" value="M" checked> 남자</label>
					<label class="labelJoin"><input type="radio" name="USER_GENDER" value="F"> 여자</label>
					<label class="labelJoin"></label>
					<label class="labelJoin"></label>
					<p class="pJoin"></p>
				</div>
				<input class="submitJoin" type="submit" value="회원가입">
			</form>
		</div>
	</div>
	
	<%@ include file="/WEB-INF/includes/footer.jsp" %>
</body>
</html>