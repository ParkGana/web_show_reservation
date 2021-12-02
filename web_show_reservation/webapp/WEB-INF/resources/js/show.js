/***********************************************************************************************
 * 공연 상세정보 팝업창 (ajax)
 ***********************************************************************************************/
function modalShowDetail(showID) {
	$.ajax({
		url: "/show/detail",
		data: { SHOW_ID: showID },
		dataType: "JSON",
		success: function(data) {
			$("#showTitle").html(data.show_NAME);
			$("#showContent").html(data.show_INFO);
			$("#btnReservation").attr("href", "/reservation?SHOW_ID=" +showID);
			$("#show-detail").modal();
		},
		error: function(err) {
			console.log(err);
		}
	});
}