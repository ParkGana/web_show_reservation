<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<title>SHOW</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="/css/common.css">
	<link rel="stylesheet" href="/css/include.css">
	<link rel="stylesheet" href="/css/show.css">
	<link rel="stylesheet" href="/css/modal.css">
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
	<script src="/js/show.js"></script>
	<script src="/js/reservation.js"></script>
</head>
<body>
	<%@ include file="/WEB-INF/includes/header.jsp" %>
	
	<%@ include file="/WEB-INF/includes/mainmenu.jsp" %>
	
	<div id="wrapGenreList">
		<div class="divGenreList">
			<a class="aGenreList" href="/show/list">전체</a>
		</div>
		<c:forEach var="genre" items="${ genreList }">
			<div class="divGenreList">
				<a class="aGenreList" href="/show/list?SHOW_GENRE_ID=${ genre.SHOW_GENRE_ID }">${ genre.SHOW_GENRE_NAME }</a>
			</div>
		</c:forEach>
	</div>
	
	<div id="wrapShowList">
		<c:forEach var="show" items="${ showList }">
			<div class="divShowList" onclick="modalShowDetail('${ show.SHOW_ID }')">
				<div class="divImgShowList">
					<img class="imgShowList" src="/image/show/${ show.SHOW_ID }.jpg">
				</div>
				<p class="pShowList">[${ show.SHOW_GENRE_NAME }] ${ show.SHOW_NAME }</p>
			</div>
		</c:forEach>
	</div>
	
	<%@ include file="/WEB-INF/includes/footer.jsp" %>
	
	<%@ include file="/WEB-INF/includes/showdetail.jsp" %>
	
	<%@ include file="/WEB-INF/includes/reservationList.jsp" %>
</body>
</html>