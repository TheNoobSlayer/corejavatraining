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
<h1><c:out value="${title}"/></h1>
<form  action="" method="get">

	<input type="radio" id="a1" name="a" value="Shirt">
  	<label for="a1">Shirt</label><br>
  	<input type="radio" id="a2" name="a" value="Cap">
  	<label for="a2">Cap</label><br>
  	<input type="radio" id="a3" name="a" value="Pant">
  	<label for="a3">Pant</label><br>
  	<input type="submit" value="Bill">
  
  	<a href="Electronics.jsp">Electronics</a>
	<a href="FoodItems.jsp">FoodItems</a>
	<a href="Bill.jsp">Bill</a>
</form>
<c:set var="apparel" value="${param.a}" scope="session"/>
<h5><c:out value="${apparel}"/></h5>
</body>
</html>