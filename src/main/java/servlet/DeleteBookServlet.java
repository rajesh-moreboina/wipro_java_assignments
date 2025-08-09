package servlet;

import dao.BookDAO;
import util.DBUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;
import java.sql.Connection;

@WebServlet("/delete")
public class DeleteBookServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        try (Connection conn = DBUtil.getConnection()) {
            new BookDAO(conn).deleteBook(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        res.sendRedirect("list");
    }
}
