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
<ol>
<c:forEach items="${requestScope.memberList}" var="eachName">
<li>
<a>${eachName.memberId}</a>
<c:set var="name" value="${eachName.memberName}" scope="session"/>
${eachName.memberName}
</a>
<a>${eachName.accountOpeningDate}</a>
<a>${eachName.membershipType}</a>
<a>${eachName.feesPaid}</a>
<a>${eachName.maxBookAllowed}</a>
<a>${eachName.penaltyAmount}</a>

</li>

</c:forEach>
</ol>
<a href="index.html">Add member again</a>
<a href="ShowAll">Show all members</a>
</body>
</html>