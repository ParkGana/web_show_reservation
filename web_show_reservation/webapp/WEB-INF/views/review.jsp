<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>REVIEW</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
	<link rel="stylesheet" href="/css/common.css">
	<link rel="stylesheet" href="/css/include.css">
	<link rel="stylesheet" href="/css/review.css">
	<link rel="stylesheet" href="/css/modal.css">
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	<script src="/js/review.js"></script>
	<script src="/js/reservation.js"></script>
</head>
<body>
	<%@ include file="/WEB-INF/includes/header.jsp" %>
	
	<%@ include file="/WEB-INF/includes/mainmenu.jsp" %>
	
	<div id="wrapChoiceShow">
		<select class="selectGenre" id="selectGenre" name="SHOW_GENRE_ID" onchange="reviewList('genre')">
			<option value=""></option>
			<c:forEach var="genre" items="${ genreList }">
				<option value="${ genre.SHOW_GENRE_ID }">${ genre.SHOW_GENRE_NAME }</option>
			</c:forEach>
		</select>
		<select class="selectShow" id="selectShow" name="SHOW_ID" onchange="reviewList('show')">
			<option value=""></option>
			<c:forEach var="show" items="${ showList }">
				<option value="${ show.SHOW_ID }">${ show.SHOW_NAME }</option>
			</c:forEach>
		</select>
	</div>
	
	<div id="wrapReviewList">
		<table id="tblReviewList">
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
			<c:forEach var="review" items="${ reviewList }">
				<tr>
					<td>${ review.REVIEW_ID }</td>
					<td onclick="toggleReviewContent(${ review.REVIEW_ID})">${ review.REVIEW_TITLE }</td>
					<td>${ review.USER_ID }</td>
					<td>${ review.REVIEW_DATE }</td>
					<td>${ review.REVIEW_READ }</td>
				</tr>
				<tr>
					<td class="tdReviewContent" id="review${ review.REVIEW_ID }" colspan="5">
						<p class="pReviewContent">${ review.REVIEW_CONTENT }</p>
						<p class="pReviewContent">* <${ review.SHOW_NAME }> 관람 후기<p>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
	<%@ include file="/WEB-INF/includes/footer.jsp" %>
	
	<%@ include file="/WEB-INF/includes/reservationList.jsp" %>
	
	<%@ include file="/WEB-INF/includes/reservationDetail.jsp" %>
</body>
</html>