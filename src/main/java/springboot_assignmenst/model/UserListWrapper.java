package springboot_assignmenst.model;

import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class UserListWrapper {
    private List<User11> users;

    public UserListWrapper() {}

    public UserListWrapper(List<User11> users) {
        this.users = users;
    }

    public List<User11> getUsers() {
        return users;
    }

    public void setUsers(List<User11> users) {
        this.users = users;
    }
}
