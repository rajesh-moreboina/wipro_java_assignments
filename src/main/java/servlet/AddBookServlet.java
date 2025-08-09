package servlet;

import model.Book;
import dao.BookDAO;
import util.DBUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Connection;

@WebServlet("/add")
public class AddBookServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("AddBook.jsp").forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Book book = new Book();
        book.setTitle(req.getParameter("title"));
        book.setAuthor(req.getParameter("author"));
        book.setPrice(Double.parseDouble(req.getParameter("price")));

        try (Connection conn = DBUtil.getConnection()) {
            new BookDAO(conn).insertBook(book);
        } catch (Exception e) {
            e.printStackTrace();
        }

        res.sendRedirect("list");
    }
}
