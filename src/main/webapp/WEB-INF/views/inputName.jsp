<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>--%>
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form  action="/nameRecive/output" method="post">
			名前：<input type="text" name="name"><br>
			<input type="submit" value="送信">		
		</form>
</body>
</html>