<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>humanStart.jsp 입니다</h2>
	<form action="<%=request.getContextPath() %>/caller3.hm" method="post">
		<table border="1">
			<tr>
				<td width="25%" align="center">아이디</td>
				<td width="75%" align="left">
					<input id="id" name="id" value=""/>
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">이름</td>
				<td width="75%" align="left">
					<input id="name" name="name" value=""/>
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">취미</td>
				<td width="75%" align="left">
					<input type="radio" name="hobby" value="독서"/>독서
					<input type="radio" name="hobby" value="야구"/>야구
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">특기</td>
				<td width="75%" align="left">
					<input type="checkbox" name="special" value="마라톤"/>마라톤
					<input type="checkbox" name="special" value="아랍어"/>아랍어
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">생일</td>
				<td width="75%" align="left">
					<input id="birth" name="birth" value=""/>
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">직업</td>
				<td width="75%" align="left">
					<select name="job">
						<option value="--">--선택해 주세요--
						<option value="학생">학생
						<option value="직원">직원
					</select>
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">가입일자</td>
				<td width="75%" align="left">
					<input id="regdate" name="regdate" value=""/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" name="" value="가입하기">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>