<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file = "Header.jsp" %>
	<form action="firstServlet" method="get">
		<table>
			<tr>
				<th>firstName</th>
				<td><input type="text" name= "firstName"></td>
				</tr>

				<th>lastName</th>
				<td><input type="text" name= "lastName" ></td>
                </tr>
                
				<th>loginId</th>
				<td><input type="text" name= "loginId"></td>
				</tr>

				<th>password</th>
				<td><input type="text" name= "password"></td>
				</tr>

				<th>address</th>
				<td><input type="text" name= "address"></td>
				</th>
				</tr>
				
				<td>
				<td><input type = "submit"> 
				</td>
				
		</table>
	</form>
</body>
</html>