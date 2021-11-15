<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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
		<div class="divIndexTitle">금주의 공연</div>
	</div>
	
	<div id="wrapSchedule">
		<div class="divIndexTitle">공연 일정</div>
	</div>
	
	<div id="wrapRankingOfTotal">
		<div class="divIndexTitle">인기 공연</div>
	</div>
	
	<div id="wrapRankingOfCategory">
		<div id="wrapRankingOfAge">
			<div class="divIndexTitle">나이대</div>
		</div>
		<div id="wrapRankingOfGender">
			<div class="divIndexTitle">성별</div>
		</div>
	</div>
	
	<%@ include file="/WEB-INF/includes/footer.jsp" %>
</body>
</html>