window.onload = () => {
	reviewList();
}

/***********************************************************************************************
 * 리뷰 목록 (ajax)
 ***********************************************************************************************/
function reviewList(state) {
	var genreID;
	var showID;
	
	if(state == 'genre') {
		genreID = $("select[name='SHOW_GENRE_ID'").val();
		showID = "";
	}
	else if(state == 'show') {
		genreID = $("select[name='SHOW_GENRE_ID'").val();
		showID = $("select[name='SHOW_ID'").val();
	}
	else {
		genreID = "";
		showID = "";
	}
	
	$.ajax({
		url : "/review/list",
		data: { SHOW_GENRE_ID:genreID, SHOW_ID:showID },
		dataType : "JSON",
		success : function(data) {
			console.log(genreID);
			console.log(showID);
			
			var strHTML = "";
			
			strHTML += "<option value=\"\"></option>";
			for(var i = 0; i < data.genreList.length; i++) {
				if(genreID == data.genreList[i].show_GENRE_ID) {
					strHTML += "<option value=\"" +data.genreList[i].show_GENRE_ID+ "\" selected>" +data.genreList[i].show_GENRE_NAME+ "</option>";
				}
				else {
					strHTML += "<option value=\"" +data.genreList[i].show_GENRE_ID+ "\">" +data.genreList[i].show_GENRE_NAME+ "</option>";
				}
			}
			
			$("#selectGenre").html(strHTML);
			
			strHTML = "";
			
			strHTML += "<option value=\"\"></option>";
			for(var i = 0; i < data.showList.length; i++) {
				if(showID == data.showList[i].show_ID) {
					strHTML += "<option value=\"" +data.showList[i].show_ID+ "\" selected>" +data.showList[i].show_NAME+ "</option>";
				}
				else {
					strHTML += "<option value=\"" +data.showList[i].show_ID+ "\">" +data.showList[i].show_NAME+ "</option>";
				}
			}
			
			$("#selectShow").html(strHTML);
			
			strHTML = "";
			
			strHTML += "<tr>";
			strHTML += "<th>글번호</th>";
			strHTML += "<th>제목</th>";
			strHTML += "<th>작성자</th>";
			strHTML += "<th>작성일</th>";
			strHTML += "<th>조회수</th>";
			strHTML += "</tr>";
			
			for(var i = 0; i < data.reviewList.length; i++) {
				strHTML += "<tr>";
				strHTML += "<td>" +(i + 1)+ "</td>";
				strHTML += "<td onclick=\"toggleReviewContent(" +data.reviewList[i].review_ID+ ")\">" +data.reviewList[i].review_TITLE+ "</td>";
				strHTML += "<td>" +data.reviewList[i].user_ID+ "</td>";
				strHTML += "<td>" +data.reviewList[i].review_DATE+ "</td>";
				strHTML += "<td>" +data.reviewList[i].review_READ+ "</td>";
				strHTML += "</tr>";
				strHTML += "<tr>";
				strHTML += "<td class=\"tdReviewContent\" id=\"review" +data.reviewList[i].review_ID+ "\" colspan=\"5\">";
				strHTML += "<p class=\"pReviewContent\">" +data.reviewList[i].review_CONTENT+ "</p>";
				strHTML += "<p class=\"pReviewContent\">* <" +data.reviewList[i].show_NAME+ "> 관람 후기<p>";
				strHTML += "</td>";
				strHTML += "</tr>";
			}
			
			$("#tblReviewList").html(strHTML);
		},
		error : function(err) {
			console.log(err);
		}
	});
}

/***********************************************************************************************
 * 리뷰 내용 펼치고 접기
 ***********************************************************************************************/
function toggleReviewContent(reviewID) {
	if($("#review" +reviewID).css("display") == "none") {
		$.ajax({
			url : "/review/read",
			data: { REVIEW_ID: reviewID },
			type: "POST",
			dataType : "JSON",
			success : function(data) {
				$("#review" +reviewID).toggle();
			},
			error : function(err) {
				console.log(err);
			}
		});
	}
	
	$("#review" +reviewID).toggle();
}