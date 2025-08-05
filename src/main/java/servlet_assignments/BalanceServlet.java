package servlet_assignments;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BalanceServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        HttpSession session = req.getSession(false);

        if(session != null && session.getAttribute("holderName") != null) {
            String name = (String) session.getAttribute("holderName");
            int balance = (Integer) session.getAttribute("balance");

            out.println("<h2>Welcome, " + name + "</h2>");
            out.println("<p>Your current balance: ₹" + balance + "</p>");
            out.println("<a href='logout'>Logout</a>");
        } else {
            out.println("<p style='color:red;'>Session expired. Please login again.</p>");
            RequestDispatcher rd = req.getRequestDispatcher("login.html");
            rd.include(req, res);
        }
    }
}

/*
Welcome, Rajesh Moreboina
Your current balance: ?50000

Logout
*/
