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
<h1>Cart</h1>
<%
out.println(session.isNew());
out.println(session.getId());
%>
<%
out.println(session.getAttribute("food"));
%>
<h5><c:out value="${food}"/></h5>
<h5><c:out value="${electronic}"/></h5>
<h5><c:out value="${apparel}"/></h5>
</body>
</html>