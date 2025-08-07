package springboot_assignmenst;

import org.springframework.stereotype.Component;

@Component("xyz")
public class ClassXYZ implements InterfacePQR {
    public void display() {
        System.out.println("Hello... I am ClassXYZ");
    }
}
