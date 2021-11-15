<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>INDEX</title>
	<link rel="stylesheet" href="/css/common.css">
	<link rel="stylesheet" href="/css/include.css">
	<link rel="stylesheet" href="/css/index.css">
</head>
<body>
	<%@ include file="/WEB-INF/includes/header.jsp" %>
	
	<%@ include file="/WEB-INF/includes/mainmenu.jsp" %>
	
	<div id="wrapShow">
		<div class="divIndexTitle">������ ����</div>
	</div>
	
	<div id="wrapSchedule">
		<div class="divIndexTitle">���� ����</div>
	</div>
	
	<div id="wrapRankingOfTotal">
		<div class="divIndexTitle">�α� ����</div>
	</div>
	
	<div id="wrapRankingOfCategory">
		<div id="wrapRankingOfAge">
			<div class="divIndexTitle">���̴�</div>
		</div>
		<div id="wrapRankingOfGender">
			<div class="divIndexTitle">����</div>
		</div>
	</div>
	
	<%@ include file="/WEB-INF/includes/footer.jsp" %>
</body>
</html>