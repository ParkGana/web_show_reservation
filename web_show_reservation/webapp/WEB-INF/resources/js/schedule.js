/*******************************************************************************
 * 공연 일정 가져오기 (ajax)
 ******************************************************************************/
function scheduleList() {
	var events = [];
	$.ajax({
		url : "/schedule/list",
		dataType : "JSON",
		async : false,
		success : function(data) {
			$.each(data, function(index, item) {
				events.push({
					'title' : item.show_NAME,
					'start' : item.schedule_DATE + ' ' + item.schedule_TIME,
					'groupId' : item.schedule_ID
				});
			});
		},
		error : function(err) {
			alert(err);
		}
	});

	return events;
}

/*******************************************************************************
 * FullCalendar 나타내기
 ******************************************************************************/
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
			console.log(event.event.groupId);
			$.ajax({
				url: "/schedule/detail",
				data: { SCHEDULE_ID: event.event.groupId },
				dataType: "JSON",
				success: function(data) {
					$.ajax({
						url: "/show/detail",
						data: { SHOW_ID: data.show_ID },
						dataType: "JSON",
						success: function(data) {
							console.log(data);
							$("#showTitle").html(data.show_NAME);
							$("#showContent").html(data.show_INFO);
							$("#show-detail").modal();
						},
						error: function(err) {
							alert('err1');
						}
					});
				},
				error: function(err) {
					alert('err2');
				}
			});
		}
	});
	calendar.render();
});
