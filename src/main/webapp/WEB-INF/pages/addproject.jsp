<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Project</title>
</head>
<body>
<form:form action="/DreamHome/project/addproject" method="post" modelAttribute="dreamHomeCommand">
<h2>Please enter the Project Details</h2>
<table>
<tr>
<td><form:input path="id" value="${project.id}" type="hidden"/></td>
</tr>
<tr>
<td>Building Name</td>
<td><form:input path="buildingName" value="${project.buildingName}" type="text"/></td>
</tr>
<tr>
<td>Sellable Area</td>
<td><form:input path="sellableArea" value="${project.sellableArea}" type="text"/></td>
</tr>
<tr>
<td>Carpet Area</td>
<td><form:input path="carpetArea" value="${project.carpetArea}" type="text"/></td>
<tr>
<td>Location</td>
<td><form:input path="area" value="${project.area}" type="text"/></td>
</tr>
<tr>
<td>Total Cost</td>
<td><form:input path="totalCost" value="${project.totalCost}" type="text"/></td>
</tr>
<tr>
<td>Visit Date</td>
<td><form:input path="visitDate" value="${project.visitDate}" type="date"/></td>
</tr>
<tr>
<td>Liked</td>
<td><form:input path="liked" value="${project.liked}" type="text"/></td>
</tr>
<tr>
<td>Approved</td>
<td><form:input path="approved" value="${project.approved}" type="text"/></td>
</tr>
<tr>
<td><input type="submit"></td>
<td><input type="reset"></td>
</tr>
</table>
</form:form>

</body>
</html>