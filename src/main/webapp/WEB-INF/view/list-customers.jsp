


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>
<head>
<title>List Customers</title>
<!-- reference our style sheet -->
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/style.css"/>" />
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<!-- put new button: Add Customer -->
			<input type="button" value="Add Customer"
				onclick="window.location.href='showFormForAdd'; return false;"
				class="add-button" />
			<!--  add our html table here -->
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<!-- loop over and print our customers -->
				<c:forEach var="tempInstructor" items="${instructors}">
					<!-- construct an "update" link with customer id -->
					<c:url var="showCoursesLink" value="/courses/showCourses">
						<c:param name="instructorId" value="${tempInstructor.id}" />
					</c:url>
					<tr>
						<td>${tempInstructor.firstName}</td>
						<td>${tempInstructor.lastName}</td>
						<td>${tempInstructor.email}</td>
						<td>
						<!-- display the update link -->
						 <a href="${showCoursesLink}">Courses</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>









