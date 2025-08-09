package dao;

import model.Book;
import java.sql.*;
import java.util.*;

public class BookDAO {
    private Connection conn;

    public BookDAO(Connection conn) {
        this.conn = conn;
    }

    public List<Book> listAllBooks() throws SQLException {
        List<Book> list = new ArrayList<>();
        String sql = "SELECT * FROM books";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            Book b = new Book();
            b.setId(rs.getInt("id"));
            b.setTitle(rs.getString("title"));
            b.setAuthor(rs.getString("author"));
            b.setPrice(rs.getDouble("price"));
            list.add(b);
        }
        return list;
    }

    public void insertBook(Book book) throws SQLException {
        String sql = "INSERT INTO books (title, author, price) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, book.getTitle());
        ps.setString(2, book.getAuthor());
        ps.setDouble(3, book.getPrice());
        ps.executeUpdate();
    }

    public Book getBook(int id) throws SQLException {
        String sql = "SELECT * FROM books WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            Book b = new Book();
            b.setId(id);
            b.setTitle(rs.getString("title"));
            b.setAuthor(rs.getString("author"));
            b.setPrice(rs.getDouble("price"));
            return b;
        }
        return null;
    }

    public void updateBook(Book book) throws SQLException {
        String sql = "UPDATE books SET title=?, author=?, price=? WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, book.getTitle());
        ps.setString(2, book.getAuthor());
        ps.setDouble(3, book.getPrice());
        ps.setInt(4, book.getId());
        ps.executeUpdate();
    }

    public void deleteBook(int id) throws SQLException {
        String sql = "DELETE FROM books WHERE id=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.executeUpdate();
    }
}
