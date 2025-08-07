package springboot_assignmenst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProgramsApp implements CommandLineRunner {

    @Autowired
    private ConfigReader configReader;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProgramsApp.class, args);
    }

    @Override
    public void run(String... args) {
        System.out.println("----- Application Config Details -----");
        configReader.showConfig();
    }
}
/*
 
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.5)

2025-08-05T06:33:55.636+05:30  INFO 17732 --- [  restartedMain] s.SpringBootProgramsApp                  : Starting SpringBootProgramsApp using Java 17.0.6 with PID 17732 (C:\Users\91630\eclipse-workspace\SpringBoot_Programs\target\classes started by 91630 in C:\Users\91630\eclipse-workspace\SpringBoot_Programs)
2025-08-05T06:33:55.640+05:30  INFO 17732 --- [  restartedMain] s.SpringBootProgramsApp                  : No active profile set, falling back to 1 default profile: "default"
2025-08-05T06:33:55.692+05:30  INFO 17732 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
Hi... I am ClassABC
2025-08-05T06:33:56.412+05:30  INFO 17732 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2025-08-05T06:33:56.444+05:30  INFO 17732 --- [  restartedMain] s.SpringBootProgramsApp                  : Started SpringBootProgramsApp in 1.164 seconds (process running for 1.578)
----- Application Config Details -----
Application Name  : Supermarket Billing Software
Version            : 3.0
Author             : TakeHome Pvt Ltd
*/
