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
<form  action="" method="get">
	<input type="radio" id="f1" name="f" value="Pizza">
  	<label for="f1">Pizza</label><br>
  	<input type="radio" id="f2" name="f" value="Burger">
  	<label for="f2">Burger</label><br>
  	<input type="radio" id="f3" name="f" value="Misal">
  	<label for="f3">Misal</label><br>
  	<input type="submit" value="Submit">

  	<a href="Electronics.jsp">Electronics</a>
	<a href="Apparel.jsp">Apparel</a>
	<a href="Bill.jsp">Bill</a>
</form>
<c:set var="food" value="${param.f}" scope="session"/>
<h5><c:out value="${food}"/></h5>
</body>
</html>