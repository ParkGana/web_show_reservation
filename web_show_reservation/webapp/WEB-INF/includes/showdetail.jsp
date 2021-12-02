<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div id="show-detail" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myLargeModalLabel" aria-hidden="true">
  <div class="modal-dialog modal-lg modal-dialog-centered">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <div id="wrapModalShowDetail">
        	<p class="pModalShowDetail" id="showTitle"></p>
        	<p class="pModalShowDetail" id="showContent"></p>
        	<a class="aModalShowDetail" id="btnReservation" href="#">예매하기</a>
        </div>
      </div>
    </div>
  </div>
</div>