<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="" method="get">
	<input type="radio" id="e1" name="e" value="Computer">
  	<label for="e1">Computer</label><br>
  	<input type="radio" id="e2" name="e" value="Mouse">
  	<label for="e2">Mouse</label><br>
  	<input type="radio" id="e3" name="e" value="Keyboard">
  	<label for="e3">Keyboard</label><br>
  	<input type="submit" value="Submit">
  	<a href="FoodItems.jsp">FoodItems</a>
	<a href="Apparel.jsp">Apparel</a>
	<a href="Bill.jsp">Bill</a>
</form>
<c:set var="electronic" value="${param.e}" scope="session"/>
<h5><c:out value="${electronic}"/></h5>
</body>
</html>