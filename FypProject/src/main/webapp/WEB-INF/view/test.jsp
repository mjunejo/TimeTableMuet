<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome spring jsp</h1>
	<form action="/save-room" method="post">
		<input type="text" name="FacultyName" placeholder="Enter FacultyName">  <br><br>
		<input type="text" name="name" placeholder="Enter Type"> <br><br>
		<input type="submit" value="Save">

	</form>

	<table border="1px">

		<thead>
			<tr>
				<th><b>Faculty Name</b></th>
				<th><b>Faculty Type</b></th>
				<th><b>Update</b></th>
				<th><b>Delete</b></th>

			</tr>
		</thead>
		<tbody>
			
		</tbody>
	</table>
</body>
</html>