package springboot_assignmenst;

import org.springframework.stereotype.Component;

@Component("abc")
public class ClassABC implements InterfacePQR {
    public void display() {
        System.out.println("Hi... I am ClassABC");
    }
}
