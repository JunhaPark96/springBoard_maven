<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/member/memberInfo" method="post">
		id: <input type="text" name="id">
		passwd: <input type="password" name="passwd">
		<input type="submit" value="회원가입">
	</form>
</body>
</html>