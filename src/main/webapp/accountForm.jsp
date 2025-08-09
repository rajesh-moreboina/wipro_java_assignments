<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head><title>Bank Account Form</title></head>
<body>
    <h2>Enter Account Details</h2>
    <form action="accountDisplay.jsp" method="post">
        Account No: <input type="text" name="accountNo" required /><br/><br/>
        Name: <input type="text" name="name" required /><br/><br/>
        Balance: <input type="number" step="0.01" name="balance" required /><br/><br/>
        Account Type: 
        <select name="accountType">
            <option value="Savings">Savings</option>
            <option value="Current">Current</option>
        </select><br/><br/>
        <input type="submit" value="Submit" />
    </form>
</body>
</html>


/*
Account Information
Account No: ${account.accountNo}

Name: ${account.name}

Balance: ${account.balance}

Account Type (from session): ${sessionScope.accountType}

Balance Status: ${account.balance >= 500 ? 'Sufficient' : 'Insufficient'}
*/
