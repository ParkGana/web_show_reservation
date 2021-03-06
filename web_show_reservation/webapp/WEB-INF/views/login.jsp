<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>LOGIN</title>
	<link rel="stylesheet" href="/css/common.css">
	<link rel="stylesheet" href="/css/include.css">
	<link rel="stylesheet" href="/css/account.css">
</head>
<body>
	<%@ include file="/WEB-INF/includes/header.jsp" %>
	
	<%@ include file="/WEB-INF/includes/mainmenu.jsp" %>
	
	<div id="wrapLogin">
		<div class="divLoginTitle">방문을 환영합니다!</div>
		<div id="divLogin">
			<form method="POST" action="/login" autocomplete="off">
				<div>
					<p class="pLogin">아이디</p>
					<input class="inputLogin" type="text" name="USER_ID"><br>
				</div>
				<div>
					<p class="pLogin">비밀번호</p>
					<input class="inputLogin" type="password" name="USER_PWD"><br>
				</div>
				<input class="submitLogin" type="submit" value="로그인">
			</form>
		</div>
	</div>
</body>
</html>