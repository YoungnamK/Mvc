<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	여기는 hello.jsp<br>
	인사말 : ${greeting }<br>
	메세지 : ${message }<br>
	<br><br><br>
	<%
		String hohoho = request.getContextPath()+"/first/hohoho.he";
	%>
	<a href="<%=hohoho%>">여기 클릭</a>
</body>
</html>