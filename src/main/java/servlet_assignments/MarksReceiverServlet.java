package servlet_assignments;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class MarksReceiverServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieve parameters from form
        String name = request.getParameter("name");
        String marksStr = request.getParameter("marks");

        // Optional: Validate input here (not empty etc.)

        // Save parameters as request attributes to pass forward
        request.setAttribute("name", name);
        request.setAttribute("marks", marksStr);

        // Forward to GradeCalculatorServlet
        RequestDispatcher dispatcher = request.getRequestDispatcher("gradeCalculator");
        dispatcher.forward(request, response);
    }
}

