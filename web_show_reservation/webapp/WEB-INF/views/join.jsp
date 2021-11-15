<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

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
		<div class="divJoinTitle">�湮�� ȯ���մϴ�!</div>
		<div id="divJoin">
			<form method="POST" action="/join">
				<div>
					<p class="pJoin">���̵�</p>
					<input class="inputJoin" type="text" name="USER_ID">
					<input class="buttonJoin" type="button" value="�ߺ� Ȯ��">
				</div>
				<div>
					<p class="pJoin">��й�ȣ</p>
					<input class="inputJoin" type="password" name="USER_PWD">
					<p class="pJoin"></p>
				</div>
				<div>
					<p class="pJoin">��й�ȣ Ȯ��</p>
					<input class="inputJoin" type="password" name="USER_PWD_CHECK">
					<p class="pJoin"></p>
				</div>
				<div>
					<p class="pJoin">�̸�</p>
					<input class="inputJoin" type="text" name="USER_NAME">
					<p class="pJoin"></p>
				</div>
				<div>
					<p class="pJoin">��ȭ��ȣ</p>
					<input class="inputJoin" type="text" name="USER_PHONE">
					<p class="pJoin"></p>
				</div>
				<div>
					<p class="pJoin">�������</p>
					<select class="selectJoin">
						<option value=""></option>
					</select>
					<select class="selectJoin">
						<option value=""></option>
					</select>
					<select class="selectJoin">
						<option value=""></option>
					</select>
					<p class="pJoin"></p>
				</div>
				<div>
					<p class="pJoin">����</p>
					<label class="labelJoin"><input type="radio" name="gender"> ����</label>
					<label class="labelJoin"><input type="radio" name="gender"> ����</label>
					<label class="labelJoin"></label>
					<label class="labelJoin"></label>
					<p class="pJoin"></p>
				</div>
				<input class="submitJoin" type="submit" value="ȸ������">
			</form>
		</div>
	</div>
	
	<%@ include file="/WEB-INF/includes/footer.jsp" %>
</body>
</html>