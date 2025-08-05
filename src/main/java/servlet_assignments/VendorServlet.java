package servlet_assignments;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VendorServlet extends HttpServlet {

    // Database connection parameters
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/vendor_db";
    private static final String JDBC_USER = "root";       // change if needed
    private static final String JDBC_PASS = "1234"; 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Vendor Records</h2>");

        try {
            // Load the JDBC driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database
            Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);

            // Prepare SQL query
            String sql = "SELECT id, name, email, phone FROM vendors";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            // Build HTML table
            out.println("<table border='1' cellpadding='5'>");
            out.println("<tr><th>ID</th><th>Name</th><th>Email</th><th>Phone</th></tr>");

            while (rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getInt("id") + "</td>");
                out.println("<td>" + rs.getString("name") + "</td>");
                out.println("<td>" + rs.getString("email") + "</td>");
                out.println("<td>" + rs.getString("phone") + "</td>");
                out.println("</tr>");
            }

            out.println("</table>");

            // Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }

        out.println("</body></html>");
    }
}

/*
Vendor Records
ID	Name	Email	Phone
1	Rajesh Kumar	rajesh.kumar@example.com	9876543210
2	Mani Sharma	mani.sharma@example.com	9123456789
3	Hari Singh	hari.singh@example.com	9988776655
4	Prabha Patel	prabha.patel@example.com	9112233445
*/