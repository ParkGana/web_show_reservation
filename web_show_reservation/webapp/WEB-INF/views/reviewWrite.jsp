<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>REVIEW</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="/css/common.css">
	<link rel="stylesheet" href="/css/include.css">
	<link rel="stylesheet" href="/css/review.css">
	<link rel="stylesheet" href="/css/modal.css">
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	<script src="/js/reservation.js"></script>
</head>
<body>
	<%@ include file="/WEB-INF/includes/header.jsp"%>

	<%@ include file="/WEB-INF/includes/mainmenu.jsp"%>

	<div id="wrapSchedule">
		<div id="divImgSchedule"><img id="imgSchedule" src="/image/show/${ scheduleInfo.SHOW_ID }.jpg"></div>
		<div id="divSchedule">
			<p class="pSchedule">${ scheduleInfo.SHOW_NAME }</p>
			<p class="pSchedule">${ scheduleInfo.SCHEDULE_DATE }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${ scheduleInfo.SCHEDULE_TIME }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${ scheduleInfo.SCHEDULE_HALL }</p>
		</div>
	</div>

	<div id="wrapReviewWrite">
		<form method="POST" action="/review/write" autocomplete="off">
			<input type="hidden" name="SCHEDULE_ID" value="${ scheduleInfo.SCHEDULE_ID }"/>
			<input type="text" class="inputReview" name="REVIEW_TITLE" placeholder="제목"/>
			<textarea class="textareaReview" name="REVIEW_CONTENT" placeholder="내용"></textarea>
			<input type="submit" class="btnReviewWrite" value="작성"/>
		</form>
	</div>

	<%@ include file="/WEB-INF/includes/footer.jsp"%>
	
	<%@ include file="/WEB-INF/includes/reservationList.jsp" %>
	
	<%@ include file="/WEB-INF/includes/reservationDetail.jsp" %>
</body>
</html>