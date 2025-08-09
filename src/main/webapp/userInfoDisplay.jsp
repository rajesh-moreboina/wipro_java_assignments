<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Submitted Information</title>
</head>
<body>
    <h2>User Submitted Information</h2>
    <p><strong>Username:</strong> ${param.username}</p>
    <p><strong>Password:</strong> ${param.password}</p>
    <p><strong>Address:</strong> ${param.address}</p>
    <p><strong>Subscribed to Newsletter:</strong> ${param.subscribe}</p>
    
    <p><strong>Favorite Web Frameworks:</strong></p>
    <ul>
        <c:forEach var="fw" items="${paramValues.frameworks}">
            <li>${fw}</li>
        </c:forEach>
    </ul>

    <p><strong>Gender:</strong> ${param.gender}</p>
    <p><strong>Favorite Number:</strong> ${param.number}</p>
</body>
</html>
