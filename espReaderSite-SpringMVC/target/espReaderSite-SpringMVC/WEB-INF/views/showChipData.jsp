<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Device Data</title>
<spring:url value="/resources/css/boatIndex.css" var="stylesheetCSS" />


<link href="${stylesheetCSS}" rel="stylesheet" />
</head>
<body>
	<div id="chipList">
		<form method="post" action="showTable">
			<table id="t01">
				<tr>
					<th>Select</th>
					<th>Chip Number</th>
					<th>Chip Nickname</th>
				</tr>

				<c:forEach items="${chiplist}" var="listLine">
					<tr>
						<td><input type="radio" name="tablename"
							value="${listLine.chipid}" ></td>
						<td>${listLine.chipid}</td>
						<td>${listLine.chip_nickname}</td>
					</tr>
				</c:forEach>
				<tr>
					<td></td>
					<td><input type="submit" name="submitto" value="Submit"></td>
				</tr>
			</table>
		</form>
	</div>
	<div id="chipData">
		<table id="t01">
			<tr>
				
				<th>Timestamp</th>
				<th>Data</th>
			</tr>

			<c:forEach items="${chipData}" var="listLine">
				<tr>
					
					<td>${listLine.timestamp}</td>
					<td>${listLine.bat_serviceV}</td>
				</tr>
			</c:forEach>
			
		</table>
	</div>
</body>
</html>