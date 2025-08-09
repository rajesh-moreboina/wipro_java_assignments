<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<jsp:useBean id="product" class="jsp_assignments.Product" scope="request" />
<jsp:setProperty name="product" property="*" />

<html>
<head>
    <title>Product Details</title>
</head>
<body>
    <h2>Product Information</h2>
    <p>Product ID: <jsp:getProperty name="product" property="productId" /></p>
    <p>Name: <jsp:getProperty name="product" property="name" /></p>
    <p>Price: <jsp:getProperty name="product" property="price" /></p>
    <p>Quantity: <jsp:getProperty name="product" property="quantity" /></p>
</body>
</html>

<!-- Product Information
Product ID: 1234

Name: laptop

Price: 76890.0

Quantity: 2 -->