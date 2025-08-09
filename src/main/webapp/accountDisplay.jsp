<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ page import="jsp_assignments.Account" %>

<jsp:useBean id="account" class="jsp_assignments.Account" scope="request" />
<jsp:setProperty name="account" property="*" />

<%
    // Store accountType in session scope
    String accType = request.getParameter("accountType");
    session.setAttribute("accountType", accType);
%>

<html>
<head><title>Account Details</title></head>
<body>
    <h2>Account Information</h2>
    <p>Account No: ${account.accountNo}</p>
    <p>Name: ${account.name}</p>
    <p>Balance: ${account.balance}</p>
    <p>Account Type (from session): ${sessionScope.accountType}</p>

    <p>
        Balance Status: 
        ${account.balance >= 500 ? 'Sufficient' : 'Insufficient'}
    </p>
</body>
</html>
