<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Footer</title>
</head>
<body>
      <%
         out.println("Designer name is "+request.getAttribute("DesignerName"));
      %>
	
<footer>
	<%
         out.println("Designer id is "+request.getAttribute("adminId"));
    %>

</footer>
</body>
</html>