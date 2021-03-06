/***********************************************************************************************
 * 공연 일정 (ajax)
 ***********************************************************************************************/
function scheduleList() {
	var events = [];
	
	$.ajax({
		url : "/schedule/fullcalendar",
		dataType : "JSON",
		async : false,
		success : function(data) {
			$.each(data, function(index, item) {
				events.push({
					'title' : item.show_NAME,
					'start' : item.schedule_DATE + ' ' + item.schedule_TIME,
					'groupId' : item.show_ID
				});
			});
		},
		error : function(err) {
			console.log(err);
		}
	});

	return events;
}

/***********************************************************************************************
 * FullCalendar
 ***********************************************************************************************/
document.addEventListener("DOMContentLoaded", function() {
	var calendar = new FullCalendar.Calendar(document.getElementById("wrapSchedule"), {
		initialView : "dayGridMonth",
		headerToolbar : {
			left : 'prev,next today',
			center : 'title',
			right : 'dayGridMonth,timeGridWeek,timeGridDay'
		},
		initialDate : '2020-01-01',
		slotMinTime : "08:00",
		slotMaxTime : "22:00",
		dayMaxEvents : true,
		locale : 'ko',
		events : scheduleList(),
		eventClick: function(event) {
			$.ajax({
				url: "/show/detail",
				data: { SHOW_ID: event.event.groupId },
				dataType: "JSON",
				success: function(data) {
					$("#showTitle").html(data.show_NAME);
					$("#showContent").html(data.show_INFO);
					$("#btnReservation").attr("href", "/reservation?SHOW_ID=" +event.event.groupId);
					$("#show-detail").modal();
				},
				error: function(err) {
					console.log(err);
				}
			});
		}
	});
	calendar.render();
});
