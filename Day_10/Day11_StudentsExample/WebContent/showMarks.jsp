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
<h5><c:out value="${frmServlet}"/></h5>
<ol>
<c:forEach items="${requestScope.nameList}" var="eachName">
<li>
<a>${eachName}</a>
</li>

</c:forEach>
</ol>
</body>
</html>