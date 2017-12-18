<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<h2>Project Details are: </h2>
<body>
<table>
<tr>
<td>Building Name : </td>
<td>${dreamHomeVO.buildingName}</td>
</tr>
<tr>
<td>Sellable Area : </td>
<td>${dreamHomeVO.sellableArea}</td>
</tr>
<tr>
<td>Carpet Area : </td>
<td>${dreamHomeVO.carpetArea}</td>
</tr>
<tr>
<td>Total Cost : </td>
<td>${dreamHomeVO.totalCost}</td>
</tr>
<tr>
<td>Location : </td>
<td>${dreamHomeVO.area}</td>
</tr>
<tr>
<td>Visit Date : </td>
<td>${dreamHomeVO.visitDate}</td>
</tr>
<tr>
<td>Liked : </td>
<td>${dreamHomeVO.liked}</td>
</tr>
<tr>
<td>Approved : </td>
<td>${dreamHomeVO.approved}</td>
</tr>
</table>
</body>
</html>