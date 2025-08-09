<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
    <h2>User Registration Form</h2>
    <form action="registerSuccess.jsp" method="post">
        Full Name: <input type="text" name="fullname" required/><br/><br/>
        Email: <input type="email" name="email" required/><br/><br/>
        Password: <input type="password" name="password" required/><br/><br/>
        Birthday: <input type="date" name="birthday" required/><br/><br/>
        Gender:
        <input type="radio" name="gender" value="Male" required/> Male
        <input type="radio" name="gender" value="Female" /> Female<br/><br/>
        Profession:
        <select name="profession">
            <option value="Student">Student</option>
            <option value="Employee">Employee</option>
            <option value="Freelancer">Freelancer</option>
            <option value="Other">Other</option>
        </select><br/><br/>
        Married:
        <input type="checkbox" name="married" value="Yes" /> Yes<br/><br/>
        Note:<br/>
        <textarea name="note" rows="4" cols="40"></textarea><br/><br/>
        <input type="submit" value="Register"/>
    </form>
</body>
</html>
