package springboot_assignmenst.repository;

import org.springframework.stereotype.Repository;
import springboot_assignmenst.model.Book12;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    private final String url = "jdbc:mysql://localhost:3306/springbootdb";
    private final String username = "root";
    private final String password = "1234";

    public List<Book12> getAllBooks() {
        List<Book12> books = new ArrayList<>();
        String query = "SELECT * FROM book12";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Book12 book = new Book12();
                book.setBookid(rs.getInt("bookid"));
                book.setBookname(rs.getString("bookname"));
                book.setAuthor(rs.getString("author"));
                book.setPrice(rs.getDouble("price"));

                System.out.println("Book fetched: " + book.getBookname()); // Debug print

                books.add(book);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }

    public void addBook(Book12 book) {
        String query = "INSERT INTO book12 (bookid, bookname, author, price) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, book.getBookid());
            stmt.setString(2, book.getBookname());
            stmt.setString(3, book.getAuthor());
            stmt.setDouble(4, book.getPrice());

            int rows = stmt.executeUpdate();

            System.out.println("Rows inserted: " + rows); // Debug print
            System.out.println("Book inserted: " + book.getBookname()); // Debug print

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
