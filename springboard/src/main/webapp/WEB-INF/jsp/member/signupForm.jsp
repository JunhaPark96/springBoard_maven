<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="${pageContext.request.contextPath}/">
	<img alt="" src="https://realresearcher.co.kr/web/upload/NNEditor/20230803/ED91B8EBB094EC98A4_EC97B0ED95A9EB89B4EC8AA4.jpg">
	</a><br>
	<a href="${pageContext.request.contextPath}/board"> 게시판-- </a>

	<a href="${pageContext.request.contextPath}/board/new"> 글 작성-- </a>

	<%-- <a href="${pageContext.request.contextPath}/login"> 로그인 페이지 </a> --%>

	<a href="${pageContext.request.contextPath}/signup"> 회원가입-- </a>
	
	<c:if test="${not empty  currentMember}">
		<br>${currentMember.name } 님 안녕하세요
		<a href="${pageContext.request.contextPath}/logout">로그아웃--</a><br>
	</c:if>
	<c:if test="${empty currentMember}">
		<a href="${pageContext.request.contextPath}/login">로그인--</a><br>
	</c:if>
	<h1>회원가입 페이지 입니다</h1>
	<div>
		<form:form action="${pageContext.request.contextPath }/signup"
			method="post" modelAttribute="memberVO">
			id: <form:input path="id" />
			<form:errors path="id"></form:errors>
			<br>
			password: <form:input path="password" />
			<form:errors path="password"></form:errors>
			<br>
			name: <form:input path="name" />
			<form:errors path="name"></form:errors>
			<br>
			address: <form:input path="address" />
			<form:errors path="address"></form:errors>
			<br>
			<input type="submit" value="회원가입">
			<br>
		</form:form>
	</div>
</body>
</html>