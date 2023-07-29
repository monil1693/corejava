<%@page import="incomraysbean.UserBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="UserListCtl.do" method="post">
		<tr>
		<tr>

			<td><input type="text" name="FirstName" placeholder="Firstname">
				<input type="date" name="dob"></td>
			<td><input type="submit" name="operation" value="search">
				<input type="submit" name="operation" value="add user"></td>

			<%
				Integer pageNo = (Integer) request.getAttribute("pageNo");
			int index = ((pageNo-1)*5)+1;
				List list = (List) request.getAttribute("list");
				Iterator it = list.iterator();
			%>

			<table border="1">
				<tr>
				     <th>Select</th>
                     <th>S.no.</th>
					<th>Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Login Id</th>
					<th>password</th>
					<th>DOB</th>
					<th>Address</th>
				</tr>
				<%
					while (it.hasNext()) {
						UserBean bean = (UserBean) it.next();
				%>
				<tr>
					<td><%=index++%></td>
					<td><input type="checkbox" name="ids" value="<%=bean.getId()%>"></td>
					<td><%=bean.getFirstName()%></td>
					<td><%=bean.getLastName()%></td>
					<td><%=bean.getLoginId()%></td>
					<td><%=bean.getPassword()%></td>
					<td><%=bean.getDob()%></td>
					<td><%=bean.getAddress()%></td>
					
					<td><a href="UserRegistrationCtl?id=<%=bean.getId()%>">edit</a></td>
					<%
						}
					%>
				
			</table>
			<input type="hidden" name="pageNo" value="<%=pageNo%>">
			<th><input type="submit" name="operation" value="previous"></th>
			<th><input type="submit" name="operation" value="next"></th>
			<th><input type="submit" name="operation" value="delete">
</body>
</html>