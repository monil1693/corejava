<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome to rays 
</h1>
<%
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String loginId = request.getParameter("loginId");
		String address = request.getParameter("address");
		String password = request.getParameter("password");
	%>
	<h3><%=firstName %></h3>
<h3><%=lastName %></h3>
<h3><%=loginId %></h3>
<h3><%=password %></h3>
<h3><%=address %></h3>


</body>
</html>