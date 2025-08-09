package servlet;

import dao.BookDAO;
import model.Book;
import util.DBUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;
import java.sql.Connection;

@WebServlet("/edit")
public class EditBookServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        try (Connection conn = DBUtil.getConnection()) {
            Book book = new BookDAO(conn).getBook(id);
            req.setAttribute("book", book);
            req.getRequestDispatcher("EditBook.jsp").forward(req, res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Book book = new Book();
        book.setId(Integer.parseInt(req.getParameter("id")));
        book.setTitle(req.getParameter("title"));
        book.setAuthor(req.getParameter("author"));
        book.setPrice(Double.parseDouble(req.getParameter("price")));

        try (Connection conn = DBUtil.getConnection()) {
            new BookDAO(conn).updateBook(book);
        } catch (Exception e) {
            e.printStackTrace();
        }

        res.sendRedirect("list");
    }
}
