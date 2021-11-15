<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="wrapHeader">
	<div id="wrapLogo">
		<a href="/"><img class="imgLogo" src="/image/logo.png" /></a>
	</div>
	<div id="wrapSearch"></div>
	<div id="wrapAccount">
		<c:choose>
			<c:when test="${ user eq null }">
				<a class="aAccount" href="/join">회원가입</a>
				<a class="aAccount" href="/login">로그인</a>
			</c:when>
			<c:otherwise>
				<a class="aAccount" href="#">${ user.USER_ID }</a>
				<a class="aAccount" href="/logout">로그아웃</a>
			</c:otherwise>
		</c:choose>
	</div>
</div>