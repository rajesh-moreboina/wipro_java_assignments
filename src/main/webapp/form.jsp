<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head><title>Student Marks Form</title></head>
<body>
    <h2>Enter Student Details</h2>
    <form action="checkMarks.jsp" method="post">
        Student Name: <input type="text" name="studentName" required /><br/><br/>
        Marks: <input type="number" name="marks" required /><br/><br/>
        <input type="submit" value="Submit" />
    </form>
</body>
</html>

/*
Result: Pass
Student Name: ${studentName}

Marks: ${marks}

© 2025 Your College Name. All rights reserved.
*/