<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
.err{
	font-size:9pt;
	color: red;
	font-weight: bold;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<h2>가입결과</h2>
		<table border="1">
			<tr>
				<td width="25%" align="center">아이디</td>
				<td width="75%" align="left">${member.id }</td>
			</tr>
			<tr>
				<td width="25%" align="center">이름</td>
				<td width="75%" align="left">${member.name }</td>
			</tr>
			<tr>
				<td width="25%" align="center">비밀번호</td>
				<td width="75%" align="left">${member.password }</td>
			</tr>
			<tr>
				<td width="25%" align="center">마일리지 포인트</td>
				<td width="75%" align="left">${member.mpoint }</td>
			</tr>
			<tr>
				<td width="25%" align="center">주소</td>
				<td width="75%" align="left">${member.address1 }</td>
			</tr>
			<tr>
				<td width="25%" align="center">세부 주소</td>
				<td width="75%" align="left">${member.address2 }</td>
			</tr>
			<tr>
				<td width="25%" align="center">이메일</td>
				<td width="75%" align="left">${member.email }</td>
			</tr>
			<tr>
				<td width="25%" align="center">가입일자</td>
				<td width="75%" align="left">${member.regdate }</td>
			</tr>
			<tr>
				<td width="25%" align="center">야구팀</td>
				<td width="75%" align="left">${member.sportsTeam }</td>
			</tr>
			<tr>
				<td width="25%" align="center">선호하는 운영 체제</td>
				<td width="75%" align="left">
				<c:forEach items="${member.favorites }" var="item">
				${item }&nbsp;
				</c:forEach>
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">직업</td>
				<td width="75%" align="left">${member.jobCode }</td>
			</tr>
			<tr>
				<td width="25%" align="center">개발툴</td>
				<td width="75%" align="left">${member.tool }</td>
			</tr>
			<tr>
				<td width="25%" align="center">기타</td>
				<td width="75%" align="left">${member.etc }</td>
			</tr>
			<tr>
				<td width="25%" align="center">약관동의</td>
				<td width="75%" align="left">${member.agreement }</td>
			</tr>
		</table>
</body>
</html>