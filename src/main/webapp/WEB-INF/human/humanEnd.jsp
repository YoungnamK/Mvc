<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td width="25%">아이디</td>
			<td width="75%">${human.id }</td>
		</tr>
	<tr>
			<td width="25%">이름</td>
			<td width="75%">${human.name }</td>
		</tr>	
		<tr>
			<td width="25%">취미</td>
			<td width="75%">${human.hobby }</td>
		</tr>
		<tr>
			<td width="25%">특기</td>
			<td width="75%">
			<c:forEach var="item" items="${human.special }">
			${item }
			</c:forEach>
			</td>
		</tr>
		<tr>
			<td width="25%">생일</td>
			<td width="75%">${human.birth }</td>
		</tr>
		<tr>
			<td width="25%">직업</td>
			<td width="75%">${human.job }</td>
		</tr>
		<tr>
			<td width="25%">가입일자</td>
			<td width="75%">${human.regdate }</td>
		</tr>
	</table>
</body>
</html>