<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="model.Book" %>
<%
    List<Book> bookList = (List<Book>) request.getAttribute("listBooks");
%>
<html>
<head><title>List of Books</title></head>
<body>
<h2>Books Management</h2>
<a href="add">Add New Book</a> | <a href="list">List All Books</a>
<hr>
<h3>List of Books</h3>
<table border="1" cellpadding="5" cellspacing="0">
    <tr><th>ID</th><th>Title</th><th>Author</th><th>Price</th><th>Actions</th></tr>
    <%
        if (bookList != null && !bookList.isEmpty()) {
            for (Book b : bookList) {
    %>
        <tr>
            <td><%= b.getId() %></td>
            <td><%= b.getTitle() %></td>
            <td><%= b.getAuthor() %></td>
            <td><%= b.getPrice() %></td>
            <td>
                <a href="edit?id=<%= b.getId() %>">Edit</a> |
                <a href="delete?id=<%= b.getId() %>">Delete</a>
            </td>
        </tr>
    <%
            }
        } else {
    %>
        <tr><td colspan="5">No books found.</td></tr>
    <%
        }
    %>
</table>
</body>
</html>
