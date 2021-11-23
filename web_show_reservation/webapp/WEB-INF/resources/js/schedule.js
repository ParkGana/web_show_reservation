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
					'title' : item.schedule_NAME,
					'start' : item.schedule_DATE + ' ' + item.schedule_TIME
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
			right : 'dayGridMonth,timeGridWeek,timeGridDay,listWeek'
		},
		initialDate : '2020-01-01',
		slotMinTime : "08:00",
		slotMaxTime : "22:00",
		dayMaxEvents : true,
		locale : 'ko',
		events : scheduleList()
	});
	calendar.render();
});
