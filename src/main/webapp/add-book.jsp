<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head><title>Add New Book</title></head>
<body>
<h2>Books Management</h2>
<a href="add">Add New Book</a> | <a href="list">List All Books</a>
<hr>
<h3>Add New Book</h3>
<form action="add" method="post">
    <table>
        <tr><td>Title:</td><td><input type="text" name="title" required></td></tr>
        <tr><td>Author:</td><td><input type="text" name="author" required></td></tr>
        <tr><td>Price:</td><td><input type="number" step="0.01" name="price" required></td></tr>
        <tr><td colspan="2"><input type="submit" value="Save"></td></tr>
    </table>
</form>
</body>
</html>
