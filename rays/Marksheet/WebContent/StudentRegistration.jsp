<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body><form action="MarksheetCtl" method="get">
		<center>
			<table>
				<h1>Marksheet</h1>

				<tr>
					<th>id</th>
					<td><input type="text" name="id"></td>
				<tr>
					<th>Name</th>
					<td><input type="text" name="Name"></td>
				<tr>
					<th>maths</th>
					<td><input type="text" name="maths"></td>
				<tr>
					<th>physics</th>
					<td><input type="text" name="physics"></td>
				<tr>
					<th>chemistry</th>
					<td><input type="text" name="chemistry"></td>
				<tr>
					<th>rollno</th>
					<td><input type="text" name="rollno"></td>
				<tr>
					<input type="submit" value="Submit">
			</table>
		</center>
	</form>

</body>
</html>