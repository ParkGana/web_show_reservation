$(document).ready (function() {
	rankGenre();
	rankGender();
	rankAge();
});

/***********************************************************************************************
 * 예매 통계 - 장르 (ajax)
 ***********************************************************************************************/
function rankGenre() {
	var genreCategoryList = [];
	var genreValueList = [];
	
	$.ajax({
		url : "/rank/genre",
		dataType : "JSON",
		success : function(data) {
			$.each(data, function(index, item) {
				genreCategoryList.push(item.item_NAME);
				genreValueList.push(item.item_CNT);
			});
			
			var config = new Chart($('#canvasRankOfGenre'), {
				type: 'pie',
				data: {
					labels: genreCategoryList,
					datasets: [{
						data: genreValueList,
						backgroundColor: [
							'rgba(255, 0, 0, 0.3)',
			                'rgba(255, 104, 0, 0.3)',
			                'rgba(255, 242, 0, 0.3)',
			                'rgba(34, 177, 76, 0.3)',
			                'rgba(0, 162, 232, 0.3)',
			                'rgba(16, 21, 102, 0.3)',
			                'rgba(112, 48, 160, 0.3)',
						],
					}],
				},
				options: {
					aspectRatio: 1,
					legend: {
				        position: 'bottom',
				        display:false
				    },
				  }
			});
		},
		error : function(err) {
			console.log(err);
		}
	});
}

/***********************************************************************************************
 * 예매 통계 - 성별 (ajax)
 ***********************************************************************************************/
function rankGender() {
	var genderCategoryList = [];
	var genderValueList = [];
	
	$.ajax({
		url : "/rank/gender",
		dataType : "JSON",
		success : function(data) {
			$.each(data, function(index, item) {
				genderCategoryList.push(item.item_NAME);
				genderValueList.push(item.item_CNT);
			});
			
			var config = new Chart($('#canvasRankOfGender'), {
				type: 'pie',
				data: {
					labels: genderCategoryList,
					datasets: [{
						data: genderValueList,
						backgroundColor: [
			                'rgba(255, 104, 0, 0.3)',
			                'rgba(112, 48, 160, 0.3)',
						],
					}],
				},
				options: {
					aspectRatio: 1,
					legend: {
				        position: 'bottom',
				        display:false
				    },
				  }
			});
		},
		error : function(err) {
			console.log(err);
		}
	});
}

/***********************************************************************************************
 * 예매 통계 - 나이대 (ajax)
 ***********************************************************************************************/
function rankAge() {
	var ageCategoryList = [];
	var ageValueList = [];
	
	$.ajax({
		url : "/rank/age",
		dataType : "JSON",
		success : function(data) {
			$.each(data, function(index, item) {
				ageCategoryList.push(item.item_NAME);
				ageValueList.push(item.item_CNT);
			});
			
			var config = new Chart($('#canvasRankOfAge'), {
				type: 'pie',
				data: {
					labels: ageCategoryList,
					datasets: [{
						data: ageValueList,
						backgroundColor: [
							'rgba(255, 0, 0, 0.3)',
			                'rgba(255, 242, 0, 0.3)',
			                'rgba(34, 177, 76, 0.3)',
			                'rgba(0, 162, 232, 0.3)',
						],
					}],
				},
				options: {
					aspectRatio: 1,
					legend: {
				        position: 'bottom',
				        display:false
				    },
				}
			});
		},
		error : function(err) {
			console.log(err);
		}
	});
}
