<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
<script type="text/javascript">
	if ('${msg}') {
		alert('${msg}');
	}
</script>
</head>
<body>
	<a href="${pageContext.request.contextPath}/"> <img alt=""
		src="https://realresearcher.co.kr/web/upload/NNEditor/20230803/ED91B8EBB094EC98A4_EC97B0ED95A9EB89B4EC8AA4.jpg">
	</a>
	<br>
	<a href="${pageContext.request.contextPath}/board"> 게시판 </a>

	<a href="${pageContext.request.contextPath}/board/new"> 글 작성 </a>

	<a href="${pageContext.request.contextPath}/login"> 로그인 페이지 </a>

	<a href="${pageContext.request.contextPath}/signup"> 회원가입 페이지 </a>

	<c:if test="${not empty  currentMember}">
		<br>${currentMember.name } 님 안녕하세요
		<a href="${pageContext.request.contextPath}/logout">로그아웃</a>
		<br>
	</c:if>
	<c:if test="${empty currentMember}">
		<a href="${pageContext.request.contextPath}/login">로그인</a>
		<br>
	</c:if>
	<h1>로그인 페이지 입니다</h1>
	<div>
		<form:form action="${pageContext.request.contextPath }/login"
			method="post" modelAttribute="loginVO">
			id: <form:input path="id" />
			<form:errors path="id"></form:errors>
			<br>
			password: <form:input path="password" />
			<form:errors path="password"></form:errors>
			<br>
			<input type="submit" value="로그인">
			<br>
		</form:form>
	</div>

</body>
</html>