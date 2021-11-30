<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>INDEX</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
	<link rel="stylesheet" href="/css/common.css">
	<link rel="stylesheet" href="/css/include.css">
	<link rel="stylesheet" href="/css/index.css">
	<link rel="stylesheet" href="/css/modal.css">
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	<script src="/js/reservation.js"></script>
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
	
	<%@ include file="/WEB-INF/includes/reservationList.jsp" %>
	
	<%@ include file="/WEB-INF/includes/reservationDetail.jsp" %>
</body>
</html>