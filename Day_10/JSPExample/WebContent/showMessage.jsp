<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- Scriplet --%>
<% out.println("Welcome to JSP"); %>

<%-- Declaration --%>
<% String city="Pune"; %>
<%out.println("Welcome to "+city); %>
<%double marks=90; %>
<%-- Expression --%>
<%=marks %>
</body>
</html>