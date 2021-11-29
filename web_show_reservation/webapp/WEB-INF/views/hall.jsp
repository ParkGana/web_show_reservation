<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>SHOW</title>
	<link rel="stylesheet" href="/css/common.css">
	<link rel="stylesheet" href="/css/include.css">
	<link rel="stylesheet" href="/css/hall.css">
</head>
<body>
	<%@ include file="/WEB-INF/includes/header.jsp" %>
	
	<%@ include file="/WEB-INF/includes/mainmenu.jsp" %>
	
	<div id="wrapHall">
		<div class="divHall">
			<p class="pHall">대극장</p>
			<c:forEach var="hall" items="${ hallInfo }" varStatus="status">
				<c:if test="${ hall.HALL_NAME eq '대극장' }">
					<div class="divHallSeat">${ hall.HALL_SEAT_NAME }</div>
					<c:choose>
						<c:when test="${ status.count % 10 eq 0 }"><br></c:when>
						<c:otherwise>
							<c:if test="${ status.count % 5 eq 0 }">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</c:if>
						</c:otherwise>
					</c:choose>
				</c:if>
			</c:forEach>
		</div>
		
		<div class="divHall">
			<p class="pHall">중극장</p>
			<c:forEach var="hall" items="${ hallInfo }" varStatus="status">
				<c:if test="${ hall.HALL_NAME eq '중극장' }">
					<div class="divHallSeat">${ hall.HALL_SEAT_NAME }</div>
					<c:choose>
						<c:when test="${ status.count % 10 eq 0 }"><br></c:when>
						<c:otherwise>
							<c:if test="${ status.count % 5 eq 0 }">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</c:if>
						</c:otherwise>
					</c:choose>
				</c:if>
			</c:forEach>
		</div>
		
		<div class="divHall">
			<p class="pHall">소극장</p>
			<c:forEach var="hall" items="${ hallInfo }" varStatus="status">
				<c:if test="${ hall.HALL_NAME eq '소극장' }">
					<div class="divHallSeat">${ hall.HALL_SEAT_NAME }</div>
					<c:choose>
						<c:when test="${ status.count % 6 eq 0 }"><br></c:when>
						<c:otherwise>
							<c:if test="${ status.count % 3 eq 0 }">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</c:if>
						</c:otherwise>
					</c:choose>
				</c:if>
			</c:forEach>
		</div>
	</div>
	
	<%@ include file="/WEB-INF/includes/footer.jsp" %>
</body>
</html>