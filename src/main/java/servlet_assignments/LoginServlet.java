package servlet_assignments;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String account = req.getParameter("account");
        String password = req.getParameter("password");

        // Dummy check - you can replace with DB check
        if(account.equals("12345") && password.equals("pass123")) {
            HttpSession session = req.getSession();
            session.setAttribute("holderName", "Rajesh Moreboina");
            session.setAttribute("balance", 50000);

            res.sendRedirect("balance");
        } else {
            out.println("<p style='color:red;'>Invalid login</p>");
            RequestDispatcher rd = req.getRequestDispatcher("login.html");
            rd.include(req, res);
        }
    }
}
