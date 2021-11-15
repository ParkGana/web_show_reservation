<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>LOGIN</title>
	<link rel="stylesheet" href="/css/common.css">
	<link rel="stylesheet" href="/css/include.css">
	<link rel="stylesheet" href="/css/login.css">
</head>
<body>
	<%@ include file="/WEB-INF/includes/header.jsp" %>
	
	<%@ include file="/WEB-INF/includes/mainmenu.jsp" %>
	
	<div id="wrapLogin">
		<div class="divLoginTitle">�湮�� ȯ���մϴ�!</div>
		<div id="divLogin">
			<form method="POST" action="/login">
				<div>
					<p class="pLogin">���̵�</p>
					<input class="inputLogin" type="text" name="USER_ID"><br>
				</div>
				<div>
					<p class="pLogin">��й�ȣ</p>
					<input class="inputLogin" type="password" name="USER_PWD"><br>
				</div>
				<input class="submitLogin" type="submit" value="�α���">
			</form>
		</div>
		<div id="divFind">
			<a class="aFind" href="#">���̵� ã��</a>
			<a class="aFind" href="#">��й�ȣ ã��</a>
		</div>
	</div>
	
	<%@ include file="/WEB-INF/includes/footer.jsp" %>
</body>
</html>