<%@page import="incomraysbean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<CENTER>
			<form action="LoginCtl" method="post">
				<%@include file="Header.jsp"%>

				<%
					String str = (String) request.getAttribute("msg");
				%>
				<%
					if (str!= null) {
				%>
				<%=str%>
				<%
					}
				%>

				<table>
					<tr>
						<th>loginId</th>


						<td><input type="text" name="loginId"></td>
					</tr>
					<th>password</th>
					<td><input type="text" name="password"></td>
					</tr>


					<td>
					<td><input type="submit" name="operation" value="signin">
						<input type="submit" name="operation" value="signup"></td>
					<th>
					<td>
					</tr>
				</table>
			</form>
		</center>
		<CENTER>
			<%@include file="Footer.jsp"%>
</body>

</html>
