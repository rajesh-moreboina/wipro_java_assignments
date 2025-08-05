package servlet_assignments;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        HttpSession session = req.getSession(false);
        if(session != null) {
            session.invalidate();
        }

        out.println("<p>You have been logged out.</p>");
        RequestDispatcher rd = req.getRequestDispatcher("login.html");
        rd.include(req, res);
    }
}
