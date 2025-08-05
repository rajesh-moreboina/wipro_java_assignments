package servlet_assignments;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String course = req.getParameter("course");

        out.println("<h2>Student Registration Details</h2>");
        out.println("<p><strong>Name:</strong> " + name + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<p><strong>Course:</strong> " + course + "</p>");
    }
}

/*
 * http://localhost:8080/ServletPrograms/register
 * 
Student Registration Details
Name: Rajesh

Email: noname@gmail.com

Course: Developer
*/
