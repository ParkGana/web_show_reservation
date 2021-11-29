/*******************************************************************************
 * 예매 목록 가져오기 (ajax)
 ******************************************************************************/
function reservationList() {
	$.ajax({
		url : "/reservation/list",
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

function test() {
	alert();
	$("#test").modal();
}