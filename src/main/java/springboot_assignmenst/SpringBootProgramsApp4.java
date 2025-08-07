package springboot_assignmenst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProgramsApp4 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootProgramsApp4.class, args);
    }
}
/*
 http://localhost:8081/users/101/accounts?type=current&status=active

Printed in Console

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.5)

2025-08-06T06:50:15.934+05:30  INFO 15036 --- [  restartedMain] s.SpringBootProgramsApp4                 : Starting SpringBootProgramsApp4 using Java 17.0.6 with PID 15036 (C:\Users\91630\eclipse-workspace\SpringBoot_Programs\target\classes started by 91630 in C:\Users\91630\eclipse-workspace\SpringBoot_Programs)
2025-08-06T06:50:15.937+05:30  INFO 15036 --- [  restartedMain] s.SpringBootProgramsApp4                 : No active profile set, falling back to 1 default profile: "default"
2025-08-06T06:50:15.994+05:30  INFO 15036 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2025-08-06T06:50:15.994+05:30  INFO 15036 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2025-08-06T06:50:17.358+05:30  INFO 15036 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8081 (http)
2025-08-06T06:50:17.379+05:30  INFO 15036 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-08-06T06:50:17.379+05:30  INFO 15036 --- [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.20]
2025-08-06T06:50:17.447+05:30  INFO 15036 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-08-06T06:50:17.450+05:30  INFO 15036 --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1453 ms
Hi... I am ClassABC
2025-08-06T06:50:17.921+05:30  INFO 15036 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2025-08-06T06:50:17.968+05:30  INFO 15036 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8081 (http) with context path ''
2025-08-06T06:50:17.982+05:30  INFO 15036 --- [  restartedMain] s.SpringBootProgramsApp4                 : Started SpringBootProgramsApp4 in 2.399 seconds (process running for 2.74)
----- Application Config Details -----
Application Name  : Supermarket Billing Software
Version            : 3.0
Author             : TakeHome Pvt Ltd
2025-08-06T06:50:44.872+05:30  INFO 15036 --- [nio-8081-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2025-08-06T06:50:44.873+05:30  INFO 15036 --- [nio-8081-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2025-08-06T06:50:44.877+05:30  INFO 15036 --- [nio-8081-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 3 ms
User ID       : 101
Account Type  : current
Status        : active

*/
