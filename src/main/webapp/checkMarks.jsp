<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
    String studentName = request.getParameter("studentName");
    String marksStr = request.getParameter("marks");
    int marks = 0;
    try {
        marks = Integer.parseInt(marksStr);
    } catch (NumberFormatException e) {
        marks = -1; // invalid marks
    }

    request.setAttribute("studentName", studentName);
    request.setAttribute("marks", marks);

    if(marks >= 40) {
        // Forward to pass.jsp
        request.getRequestDispatcher("pass.jsp").forward(request, response);
    } else {
        // Forward to fail.jsp
        request.getRequestDispatcher("fail.jsp").forward(request, response);
    }
%>
