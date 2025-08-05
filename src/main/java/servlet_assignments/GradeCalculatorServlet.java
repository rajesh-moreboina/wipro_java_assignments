package servlet_assignments;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class GradeCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieve attributes forwarded by first servlet
        String name = (String) request.getAttribute("name");
        String marksStr = (String) request.getAttribute("marks");

        int marks = 0;
        String grade = "N/A";

        try {
            marks = Integer.parseInt(marksStr);
        } catch (NumberFormatException e) {
            grade = "Invalid marks";
        }

        // Simple grading logic
        if (marks >= 90) grade = "A+";
        else if (marks >= 80) grade = "A";
        else if (marks >= 70) grade = "B+";
        else if (marks >= 60) grade = "B";
        else if (marks >= 50) grade = "C";
        else grade = "Fail";

        // Prepare response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Result for " + name + "</h2>");
        out.println("<p><strong>Marks:</strong> " + marks + "</p>");
        out.println("<p><strong>Grade:</strong> " + grade + "</p>");
        out.println("</body></html>");
    }
}

/*

http://localhost:8080/ServletPrograms/marksReceiver

Result for Pabhash
Marks: 98

Grade: A+
*/

