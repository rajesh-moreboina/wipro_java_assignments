<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>User Info Form</title>
</head>
<body>
    <h2>User Information Form</h2>
    <form action="userInfoDisplay.jsp" method="post">
        Username: <input type="text" name="username" required/><br/><br/>
        Password: <input type="password" name="password" required/><br/><br/>
        Address: <textarea name="address" rows="4" cols="40" required></textarea><br/><br/>
        Subscribe to Newsletter: 
        <input type="checkbox" name="subscribe" value="Yes" /> Yes<br/><br/>
        
        Favorite Web Framework:<br/>
        <input type="checkbox" name="frameworks" value="Spring" /> Spring<br/>
        <input type="checkbox" name="frameworks" value="Hibernate" /> Hibernate<br/>
        <input type="checkbox" name="frameworks" value="Struts" /> Struts<br/><br/>

        Gender:
        <input type="radio" name="gender" value="Male" required/> Male
        <input type="radio" name="gender" value="Female" /> Female<br/><br/>

        Favorite Number: 
        <select name="number">
            <option value="1">One</option>
            <option value="2">Two</option>
            <option value="3">Three</option>
            <option value="4">Four</option>
        </select><br/><br/>

        <input type="submit" value="Submit" />
    </form>
</body>
</html>

/*
User Submitted Information
Username: Rajesh

Password: 123

Address: Hyderbad

Subscribed to Newsletter:

Favorite Web Frameworks:

Spring
Hibernate
Gender: Male

Favorite Number: 1
*/