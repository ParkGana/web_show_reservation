<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>RESERVATION</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
	<link rel="stylesheet" href="/css/common.css">
	<link rel="stylesheet" href="/css/include.css">
	<link rel="stylesheet" href="/css/reservation.css">
	<link rel="stylesheet" href="/css/modal.css">
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	<script src="/js/reservation.js"></script>
</head>
<body>
	<%@ include file="/WEB-INF/includes/header.jsp"%>

	<%@ include file="/WEB-INF/includes/mainmenu.jsp"%>

	<div id="wrapImgShow">
		<div id="divImgShow"><img id="imgShow" src="/image/show/${ showInfo.SHOW_ID }.jpg"></div>
	</div>

	<div id="wrapScheduleList">
		<table id="tblScheduleList">
			<tr>
				<th>상영 날짜</th>
				<th>상영 시간</th>
				<th>상영관</th>
				<th>잔여 좌석</th>
				<th></th>
			</tr>
			<c:choose>
				<c:when test="${ fn:length(scheduleList) eq 0 }">
					<tr>
						<td colspan="5">상영 일정이 존재하지 않습니다.</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach var="schedule" items="${ scheduleList }">
						<tr>
							<td>${ schedule.SCHEDULE_DATE }</td>
							<td>${ schedule.SCHEDULE_TIME }</td>
							<td>${ schedule.SCHEDULE_HALL }</td>
							<td>${ schedule.SCHEDULE_REMAIN_SEAT }</td>
							<td><a id="aReservationSeat" href="javascript:void(0);" onclick="reservationChoice(${ schedule.SCHEDULE_ID })">예매</a></td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
			
		</table>
	</div>

	<div id="wrapReservation"></div>

	<%@ include file="/WEB-INF/includes/footer.jsp"%>
	
	<%@ include file="/WEB-INF/includes/reservationList.jsp" %>
	
	<%@ include file="/WEB-INF/includes/reservationDetail.jsp" %>
</body>
</html>