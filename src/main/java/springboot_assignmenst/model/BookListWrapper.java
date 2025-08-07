package springboot_assignmenst.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "list")
public class BookListWrapper {
    private List<Book> items;

    public BookListWrapper() {}

    public BookListWrapper(List<Book> items) {
        this.items = items;
    }

    @XmlElement(name = "item")
    public List<Book> getItems() {
        return items;
    }

    public void setItems(List<Book> items) {
        this.items = items;
    }
}
