package servlet;

import dao.BookDAO;
import util.DBUtil;
import model.Book;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet("/list")
public class ListBookServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try (Connection conn = DBUtil.getConnection()) {
            List<Book> books = new BookDAO(conn).listAllBooks();
            req.setAttribute("listBooks", books);
            req.getRequestDispatcher("ListBooks.jsp").forward(req, res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
