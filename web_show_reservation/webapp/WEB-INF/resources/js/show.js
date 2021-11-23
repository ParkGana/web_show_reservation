/***********************************************************************************************
 * 공연 상세정보 팝업창 띄우기 (ajax)
 ***********************************************************************************************/
function modalShowDetail(showID) {
	$.ajax({
		url: "/show/detail",
		data: { SHOW_ID: showID },
		dataType: "JSON",
		success: function(data) {
			$("#showTitle").html(data.show_NAME);
			$("#showContent").html(data.show_INFO);
			$("#show-detail").modal();
		},
		error: function(err) {
			alert(err);
		}
	});
}