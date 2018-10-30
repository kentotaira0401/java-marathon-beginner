<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>合計金額</h1>

	■税抜き価格
	<br>
	<fmt:formatNumber value="${totalNum}" pattern="###,###" />円
	<br> 
	
	■税込み価格
	<br>
	<fmt:formatNumber value="${taxNum}" pattern="###,###" />円
	<br>


</body>
</html>