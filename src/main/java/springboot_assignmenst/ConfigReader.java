package springboot_assignmenst;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config.properties")
public class ConfigReader {

    @Value("${app.name}")
    private String name;

    @Value("${app.version}")
    private String version;

    @Value("${app.author}")
    private String author;

    public void showConfig() {
        System.out.println("Application Name  : " + name);
        System.out.println("Version            : " + version);
        System.out.println("Author             : " + author);
    }
}
