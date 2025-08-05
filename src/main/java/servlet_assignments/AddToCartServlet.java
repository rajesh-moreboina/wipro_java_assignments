package servlet_assignments;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AddToCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String[] selectedItems = request.getParameterValues("item");

        if (selectedItems != null) {
            for (String item : selectedItems) {
                // Create cookie with item name
                Cookie cookie = new Cookie("cartItem_" + item, item);
                cookie.setMaxAge(60 * 60 * 24);  // 1 day lifetime
                response.addCookie(cookie);
            }
        }

        // Redirect back to selection page or confirmation
        response.sendRedirect("productSelection.html");
    }
}
