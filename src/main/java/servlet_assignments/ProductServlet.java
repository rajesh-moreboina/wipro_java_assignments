package servlet_assignments;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String product = request.getParameter("product");
        String price = request.getParameter("price");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Enter Quantity for " + product + "</h2>");
        out.println("<form action='orderServlet' method='post'>");

        // Hidden fields to carry product and price forward
        out.println("<input type='hidden' name='product' value='" + product + "'>");
        out.println("<input type='hidden' name='price' value='" + price + "'>");

        out.println("Quantity: <input type='number' name='quantity' min='1' required><br><br>");
        out.println("<input type='submit' value='Calculate Total'>");

        out.println("</form>");
        out.println("</body></html>");
    }
}
