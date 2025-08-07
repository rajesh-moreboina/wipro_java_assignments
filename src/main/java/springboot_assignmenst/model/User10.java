package springboot_assignmenst.model;

import jakarta.validation.constraints.*;

public class User10 {

    @NotBlank(message = "{username.required}")
    private String username;

    @Size(min = 6, message = "{password.length}")
    private String password;

    @Email(message = "{email.invalid}")
    private String email;

    @NotNull(message = "{age.required}")
    @Min(value = 18, message = "{age.min}")
    private Integer age;

    // Getters and setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }
}
