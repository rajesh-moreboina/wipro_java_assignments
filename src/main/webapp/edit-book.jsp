<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.Book" %>
<%
    Book book = (Book) request.getAttribute("book");
%>
<html>
<head><title>Edit Book</title></head>
<body>
<h2>Edit Book</h2>
<a href="add">Add New Book</a> | <a href="list">List All Books</a>
<hr>
<form action="edit" method="post">
    <input type="hidden" name="id" value="<%= book.getId() %>">
    <table>
        <tr><td>Title:</td><td><input type="text" name="title" value="<%= book.getTitle() %>" required></td></tr>
        <tr><td>Author:</td><td><input type="text" name="author" value="<%= book.getAuthor() %>" required></td></tr>
        <tr><td>Price:</td><td><input type="number" step="0.01" name="price" value="<%= book.getPrice() %>" required></td></tr>
        <tr><td colspan="2"><input type="submit" value="Update"></td></tr>
    </table>
</form>
</body>
</html>
