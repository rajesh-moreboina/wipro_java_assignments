package springboot_assignmenst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Client {

    @Autowired
    @Qualifier("abc") // Switch to "xyz" to get ClassXYZ output
    private InterfacePQR pqr;

    @PostConstruct
    public void init() {
        pqr.display();
    }
}
