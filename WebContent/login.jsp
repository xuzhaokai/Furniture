<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>登陆</h1>
	<s:form action="manageLoginAction" method="post" namespace="/">
		<table>
			<tr>
				<td>姓名</td>
				<td><s:textfield name="username"/></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><s:password name="password"/> </td>
			</tr>
			<tr>
				<td colspan="2"><s:submit value="登陆" /></td>
			</tr>
		</table>
	</s:form>
</body>
</html>