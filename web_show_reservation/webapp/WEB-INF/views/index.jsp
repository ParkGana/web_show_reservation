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
	<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.js"></script>
	<script src="/js/index.js"></script>
	<script src="/js/reservation.js"></script>
</head>
<body>
	<%@ include file="/WEB-INF/includes/header.jsp" %>
	
	<%@ include file="/WEB-INF/includes/mainmenu.jsp" %>
	
	<div id="wrapRankOfShow">
		<div class="divIndexTitle">인기 공연</div>
		<p class="pIndexTitle">* 종합 *</p>
		<c:forEach var="show" items="${ rankShow }" varStatus="status">
			<c:if test="${ status.count <= 5 }">
				<div class="divRankOfShow">
					<p class="pRankOfShow">${ status.count }</p>
					<div class="divImgRankOfShow">
						<img class="imgRankOfShow" src="/image/show/${ show.ITEM_ID }.jpg">
					</div>
				</div>
			</c:if>
		</c:forEach>
	</div>
	
	<div id="wrapRankOfGender">
		<div id="wrapRankOfGenderLeft">
			<p class="pIndexTitle">* 남자 *</p>
			<c:forEach var="show" items="${ rankShowOfMale }" varStatus="status">
				<c:if test="${ status.count <= 2 }">
					<div class="divRankOfGender">
						<div class="divImgRankOfGender">
							<img class="imgRankOfGender" src="/image/show/${ show.ITEM_ID }.jpg">
						</div>
					</div>
				</c:if>
			</c:forEach>
		</div>
		<div id="wrapRankOfGenderRight">
			<p class="pIndexTitle">* 여자 *</p>
			<c:forEach var="show" items="${ rankShowOfFemale }" varStatus="status">
				<c:if test="${ status.count <= 2 }">
					<div class="divRankOfGender">
						<div class="divImgRankOfGender">
							<img class="imgRankOfGender" src="/image/show/${ show.ITEM_ID }.jpg">
						</div>
					</div>
				</c:if>
			</c:forEach>
		</div>
	</div>
	
	<div id="wrapRankOfAge">
		<c:forEach var="show" items="${ rankShowOfTwenty }" varStatus="status">
			<c:if test="${ status.count <= 1 }">
				<div class="divRankOfAge">
					<p class="pIndexTitle">* 20대 *</p>
					<div class="divImgRankOfAge">
						<img class="imgRankOfAge" src="/image/show/${ show.ITEM_ID }.jpg">
					</div>
				</div>
			</c:if>
		</c:forEach>
		<c:forEach var="show" items="${ rankShowOfThirty }" varStatus="status">
			<c:if test="${ status.count <= 1 }">
				<div class="divRankOfAge">
					<p class="pIndexTitle">* 30대 *</p>
					<div class="divImgRankOfAge">
						<img class="imgRankOfAge" src="/image/show/${ show.ITEM_ID }.jpg">
					</div>
				</div>
			</c:if>
		</c:forEach>
		<c:forEach var="show" items="${ rankShowOfForty }" varStatus="status">
			<c:if test="${ status.count <= 1 }">
				<div class="divRankOfAge">
					<p class="pIndexTitle">* 40대 *</p>
					<div class="divImgRankOfAge">
						<img class="imgRankOfAge" src="/image/show/${ show.ITEM_ID }.jpg">
					</div>
				</div>
			</c:if>
		</c:forEach>
		<c:forEach var="show" items="${ rankShowOfFifty }" varStatus="status">
			<c:if test="${ status.count <= 1 }">
				<div class="divRankOfAge">
					<p class="pIndexTitle">* 50대 *</p>
					<div class="divImgRankOfAge">
						<img class="imgRankOfAge" src="/image/show/${ show.ITEM_ID }.jpg">
					</div>
				</div>
			</c:if>
		</c:forEach>
	</div>
	
	<div id="wrapRankOfCategory">
		<div class="divIndexTitle">예매 통계</div>
		<div class="divRankOfCategory">
			<p class="pIndexTitle">* 장르 *</p>
			<canvas class="canvasRankOfCategory" id="canvasRankOfGenre"></canvas>
		</div>
		<div class="divRankOfCategory">
			<p class="pIndexTitle">* 성별 *</p>
			<canvas class="canvasRankOfCategory" id="canvasRankOfGender"></canvas>
		</div>
		<div class="divRankOfCategory">
			<p class="pIndexTitle">* 나이대 *</p>
			<canvas class="canvasRankOfCategory" id="canvasRankOfAge"></canvas>
		</div>
	</div>
	
	<%@ include file="/WEB-INF/includes/footer.jsp" %>
	
	<%@ include file="/WEB-INF/includes/reservationList.jsp" %>
	
	<%@ include file="/WEB-INF/includes/reservationDetail.jsp" %>
</body>
</html>