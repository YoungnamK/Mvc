<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		.err{
			font-size:9pt;
			color: red;
			font-weight: bold;
		}
	</style>
</head>
<body>
	<h2>humanStart.jsp 입니다</h2>
	
	<c:set var="apppath" value="<%=request.getContextPath()%>"/>
	<!--스프링 폼태그에서 표현식은 지원이 안되고, el만 지원이 가능하기때문에 지정해줌  -->
	
	<form:form commandName="human" action="${apppath }/caller3.hm" method="post">
		<table border="1">
			<tr>
				<td width="25%" align="center">아이디</td>
				<td width="75%" align="left">
					<form:input path="id"/><!--path는 일반 input태그의 name과 같음  -->
					<form:errors path="id" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">이름</td>
				<td width="75%" align="left">
					<form:input path="name"/>
					<form:errors path="name" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">취미</td>
				<td width="75%" align="left">
					<form:radiobuttons path="hobby" items="${hobbies }" itemLabel="korea" itemValue="english"/>
					<form:errors path="hobby" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">특기</td>
				<td width="75%" align="left">
					<form:checkboxes items="${specialist }" path="special" />
					<form:errors path="special" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td width="25%" align="center">생일</td>
				<td width="75%" align="left">
					<form:input path="birth"/>
					<form:errors path="birth" cssClass="err"/>
				</td>
			</tr>
			<%-- <tr>
				<td width="25%" align="center">직업(jstl)</td>
				<td width="75%" align="left">
					<select name="job"> 
						<c:forEach items="${joblists }" var="oneitem">
							<option value="${oneitem.code }">${oneitem.name }
						</c:forEach>
					</select>
					<form:errors path="job" cssClass="err"/>	
				</td>
			</tr> --%>
			<tr>
				<td width="25%" align="center">직업(방법1)</td>
				<td width="75%" align="left">
					<form:select path="job" items="${joblists }" 
					itemLabel="name" 
					itemValue="code"/>
					<form:errors path="job" cssClass="err"/>	
				</td>
			</tr>
			<%-- <tr>
				<td width="25%" align="center">직업(방법2)</td>
				<td width="75%" align="left">
					<form:select path="job">
						<form:options items="${joblists }" itemLabel="name" itemValue="code"/>
					</form:select>
					<form:errors path="job" cssClass="err"/>	
				</td>
			</tr> --%>
			<tr>
				<td width="25%" align="center">가입일자</td>
				<td width="75%" align="left">
					<form:input path="regdate"/>
					<form:errors path="regdate" cssClass="err"/>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="submit" name="" value="가입하기">
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>