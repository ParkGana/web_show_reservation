/*******************************************************************************
 * 예매 목록 가져오기 (ajax)
 ******************************************************************************/
function reservationList() {
	$.ajax({
		url : "/reservation/list/my",
		dataType : "JSON",
		success : function(data) { 
			var strHTML = "";
			
			strHTML += "<table id=\"tblModalReservationList\">";
			
			$.each(data, function(index, item) {
				strHTML += "<tr>";
				strHTML += "<td>" +(index + 1)+ "</td>";
				strHTML += "<td>" +item.show_DATE+ "</td>";
				strHTML += "<td>" +item.show_TIME+ "</td>";
				strHTML += "<td onclick=\"reservationDetail(" +item.schedule_ID+ ")\">" +item.show_NAME+ "</td>";
				
				var today = new Date('2020-12-03');
				var dday = new Date(item.show_DATE.split('-')[0], item.show_DATE.split('-')[1] - 1, item.show_DATE.split('-')[2]);
				var gap = dday.getTime() - today.getTime();
				var result = Math.ceil(gap / (1000 * 60 * 60 * 24));
				
				if(result > 0) {
					strHTML += "<td><span class=\"badge badge-pill badge-info\">D+" +result+ "</span></td>";
				}
				else if(result == 0) {
					strHTML += "<td><span class=\"badge badge-pill badge-danger\">D-Day</span></td>";
				}
				else {
					strHTML += "<td><span class=\"badge badge-pill badge-secondary\">종료</span></td>";
				}
				
				strHTML += "</tr>";
			});
			
			strHTML += "</table>";
			
			$("#divModalReservationList").html(strHTML);
			$("#reservation-list").modal();
		},
		error : function(err) {
			alert(err);
		}
	});
}

function reservationDetail(scheduleID) {
	$.ajax({
		url : "/schedule/hall",
		data: { SCHEDULE_ID: scheduleID },
		dataType : "JSON",
		success : function(data1) { 
			var strHTML = "";
			
			$.each(data1, function(index, item) {
				strHTML += "<div class=\"divModalHallSeat\" id=\"" +item.hall_SEAT_NAME+ "\">" +item.hall_SEAT_NAME+ "</div>";
				
				if(item.hall_NAME == '대극장' || item.hall_NAME == '중극장') {
					if((index + 1) % 10 == 0) {
						strHTML += "<br>";
					}
					else if((index + 1) % 5 == 0) {
						strHTML += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
					}
				}
				else if(item.hall_NAME == '소극장') {
					if((index + 1) % 6 == 0) {
						strHTML += "<br>";
					}
					else if((index + 1) % 3 == 0) {
						strHTML += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
					}
				}
			});
			
			$("#divModalReservationDetail").html(strHTML);
			
			$.ajax({
				url : "/reservation/seat/my",
				data: { SCHEDULE_ID: scheduleID },
				dataType : "JSON",
				success : function(data2) { 
					$.each(data1, function(index1, item1) {
						$.each(data2, function(index2, item2) {
							if(document.getElementById(item1.hall_SEAT_NAME).innerHTML == item2.reservation_SEAT) {
								$("#" +item1.hall_SEAT_NAME).css("background-color", "gray");
								$("#" +item1.hall_SEAT_NAME).css("color", "white");
							}
						});
					});
				},
				error : function(err) {
					alert(err);
				}
			});
			
			$("#reservation-detail").modal();
		},
		error : function(err) {
			alert(err);
		}
	});
}
