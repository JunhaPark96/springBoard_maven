<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 게시글</title>
</head>
<body>
	<%-- ${boardVO} --%>
	<a href="${pageContext.request.contextPath}/">
	<img alt="" src="https://realresearcher.co.kr/web/upload/NNEditor/20230803/ED91B8EBB094EC98A4_EC97B0ED95A9EB89B4EC8AA4.jpg">
	</a><br>
	<a href="${pageContext.request.contextPath}/board"> 게시판 </a>

	<a href="${pageContext.request.contextPath}/board/new"> 글 작성 </a>

	<a href="${pageContext.request.contextPath}/login"> 로그인 페이지 </a>

	<a href="${pageContext.request.contextPath}/signup"> 회원가입 페이지 </a>
	
	<c:if test="${not empty  currentMember}">
		<br>${currentMember.name } 님 안녕하세요
		<a href="${pageContext.request.contextPath}/logout">로그아웃</a><br>
	</c:if>
	<c:if test="${empty currentMember}">
		<a href="${pageContext.request.contextPath}/login">로그인</a><br>
	</c:if>
	<div align="center">
		<table>
			<thead>
				<tr>
					<th>번호</th>
					<td>${boardVO.no}</td>
				</tr>
				<tr>
					<th>제목</th>
					<td>${boardVO.title}</td>
				</tr>
				<tr>
					<th>작성자</th>
					<td>${boardVO.writer}</td>
				</tr>
				<tr>
					<th>작성일</th>
					<td>${boardVO.regDate}</td>
				</tr>
				<tr>
					<th>조회수</th>
					<td>${boardVO.count}</td>
				</tr>
				<tr>
					<th>내용</th>
					<td>${boardVO.content}</td>
				</tr>
			</thead>
			
			<tbody>
			</tbody>
		</table>
	</div>
</body>
</html>