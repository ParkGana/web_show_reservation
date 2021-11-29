<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>JOIN</title>
	<link rel="stylesheet" href="/css/common.css">
	<link rel="stylesheet" href="/css/include.css">
	<link rel="stylesheet" href="/css/account.css">
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="/js/join.js"></script>
</head>
<body>
	<%@ include file="/WEB-INF/includes/header.jsp" %>
	
	<%@ include file="/WEB-INF/includes/mainmenu.jsp" %>
	
	<div id="wrapJoin">
		<div class="divJoinTitle">방문을 환영합니다!</div>
		<div id="divJoin">
			<form method="POST" action="/join" name="formJoin">
				<input type="hidden" id="checkID" value="false">
				<div>
					<p class="pJoin">아이디</p>
					<input class="inputJoin" id="USER_ID" type="text" name="USER_ID" onchange="changeUserID()">
					<input class="buttonJoin" id="btnID" type="button" value="중복 확인" onclick="checkUserID()">
				</div>
				<div>
					<p class="pJoin">비밀번호</p>
					<input class="inputJoin" id="USER_PWD" type="password" name="USER_PWD">
					<p class="pJoin"></p>
				</div>
				<div>
					<p class="pJoin">비밀번호 확인</p>
					<input class="inputJoin" id="USER_PWD_CHECK" type="password" name="USER_PWD_CHECK">
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
						<option value="">년</option>
						<c:forEach var="year" begin="1901" end="2021" step="1">
							<option value="${ year }">${ year }</option>
						</c:forEach>
					</select>
					<select class="selectJoin" name="USER_BIRTH_MONTH">
						<option value="">월</option>
						<c:forEach var="month" begin="1" end="12" step="1">
							<option value="${ month }">${ month }</option>
						</c:forEach>
					</select>
					<select class="selectJoin" name="USER_BIRTH_DAY">
						<option value="">일</option>
						<c:forEach var="day" begin="1" end="31" step="1">
							<option value="${ day }">${ day }</option>
						</c:forEach>
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
				<input class="submitJoin" type="button" value="회원가입" onclick="submitJoin()">
			</form>
		</div>
	</div>
</body>
</html>