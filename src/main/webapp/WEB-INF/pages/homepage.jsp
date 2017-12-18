<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
	function getSelectedProject() {

		var selectedOption = document.getElementById("selProject");
		if (selectedOption.value == 'select') {
			alert("Please select a valid society name");
			document.getElementById("submitButton").disabled = true;
		} else {
			document.getElementById("submitButton").disabled = false;
		}
	}
	
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Project Details</title>
</head>
<body>
	<br>

<!-- 	<form action=/DreamHome/project/projectdetails method="post"> -->
		<%-- <label>Please select a society :</label> 
		<select id="selProject"
			name="projectList" onchange="getSelectedProject()">
			<option value="select">--Select--</option>
			<c:forEach items="${list}" var="buildingName">
				<option value="${buildingName}">${buildingName}</option>
			</c:forEach>

		</select>
		<button id="submitButton" type="submit" disabled="disabled">submit</button>
		 --%>
		<h2>List Of Projects</h2>
	<table align="left" border="1">
		<tr>
			<th>Building Name</th>
			<th>Sellable Area</th>
			<th>Carpet Area</th>
			<th>Location</th>
			<th>Total Cost</th>
			<th>Visit Date</th>
			<th>Liked</th>
			<th>Approved</th>
			<th>Actions on Row</th>
		</tr>

		<c:forEach items="${projectList}" var="project">
			<tr>
				<td><c:out value="${project.buildingName}"/></td>
				<td><c:out value="${project.sellableArea}"/></td>
				<td><c:out value="${project.carpetArea}"/></td>
				<td><c:out value="${project.area}"/></td>
				<td><c:out value="${project.totalCost}"/></td>
				<td><c:out value="${project.visitDate}"/></td>
				<td><c:out value="${project.liked}"/></td>
				<td><c:out value="${project.approved}"/></td>
			
				<td align="center"><a href="/DreamHome/project/editproject/${project.id}">Edit</a> | <a href="/DreamHome/project/deleteproject/${project.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
		
		
<!-- 	</form> -->


</body>
</html>