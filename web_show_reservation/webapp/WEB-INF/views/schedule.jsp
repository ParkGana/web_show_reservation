<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>SCHEDULE</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="/css/fullcalendar.css">
	<link rel="stylesheet" href="/css/common.css">
	<link rel="stylesheet" href="/css/include.css">
	<link rel="stylesheet" href="/css/schedule.css">
	<link rel="stylesheet" href="/css/modal.css">
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	<script src="/js/fullcalendar.js"></script>
	<script src="/js/schedule.js"></script>
	<script src="/js/reservation.js"></script>
</head>
<body>
	<%@ include file="/WEB-INF/includes/header.jsp"%>

	<%@ include file="/WEB-INF/includes/mainmenu.jsp"%>

	<div id="wrapSchedule"></div>

	<%@ include file="/WEB-INF/includes/footer.jsp"%>
	
	<%@ include file="/WEB-INF/includes/showdetail.jsp" %>
	
	<%@ include file="/WEB-INF/includes/reservationList.jsp" %>
</body>
</html>