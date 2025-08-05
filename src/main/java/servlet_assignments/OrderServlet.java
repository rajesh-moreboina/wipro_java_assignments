package servlet_assignments;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class OrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String product = request.getParameter("product");
        String priceStr = request.getParameter("price");
        String quantityStr = request.getParameter("quantity");

        int price = 0, quantity = 0, total = 0;
        try {
            price = Integer.parseInt(priceStr);
            quantity = Integer.parseInt(quantityStr);
            total = price * quantity;
        } catch (NumberFormatException e) {
            // Handle parsing error if needed
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Receipt</h2>");
        out.println("<p>Product: " + product + "</p>");
        out.println("<p>Price per unit: ₹" + price + "</p>");
        out.println("<p>Quantity: " + quantity + "</p>");
        out.println("<p><strong>Total: ₹" + total + "</strong></p>");
        out.println("</body></html>");
    }
}

/*
http://localhost:8080/ServletPrograms/product.html
Receipt
Product: Smartphone

Price per unit: ?30000

Quantity: 3

Total: ?90000
*/