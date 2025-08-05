package servlet_assignments;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ViewCartServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Your Cart Items</h2>");

        boolean hasItems = false;
        if (cookies != null) {
            out.println("<ul>");
            for (Cookie cookie : cookies) {
                if (cookie.getName().startsWith("cartItem_")) {
                    hasItems = true;
                    out.println("<li>" + cookie.getValue() + "</li>");
                }
            }
            out.println("</ul>");
        }

        if (!hasItems) {
            out.println("<p>Your cart is empty.</p>");
        }

        out.println("<br><a href='productSelection.html'>Back to Shop</a>");
        out.println("</body></html>");
    }
}

/*
 http://localhost:8080/ServletPrograms/productSelection.html
Your Cart Items
Laptop
Camera
Headphones

Back to Shop
*/
