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
<%
	String title=(String)request.getAttribute("loginPageTitle");
	out.println("Using Scriplet"+title);
%>
<%
out.println(session.isNew());
out.println(session.getId());
%>
<h4><c:out value="${loginPageTitle}"/></h4>
<%
session.invalidate();
%>

<a href="WelcomeServlet">Next Page</a>
</body>
</html>