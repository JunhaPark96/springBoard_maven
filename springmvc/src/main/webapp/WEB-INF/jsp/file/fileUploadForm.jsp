<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/file/upload" method="post" enctype="multipart/form-data">
		<input type="text" name="id" value="test"><br>
		<input type="file" name="attachFile1" value="test"><br>
		<input type="file" name="attachFile2" value="test"><br>
		<input type="submit" value="업로드"><br>
	</form>
</body>
</html>