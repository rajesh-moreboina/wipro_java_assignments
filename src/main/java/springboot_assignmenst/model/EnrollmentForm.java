package springboot_assignmenst.model;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;
import java.util.List;

public class EnrollmentForm {

    @Size(min = 3, max = 30, message = "{firstname.size}")
    private String firstName;

    @Size(min = 3, max = 30, message = "{lastname.size}")
    private String lastName;

    @NotEmpty(message = "{sex.required}")
    private String sex;

    @NotNull(message = "{dob.required}")
    @Past(message = "{dob.past}")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dob;

    @NotEmpty(message = "{email.required}")
    @Email(message = "{email.invalid}")
    private String email;

    @NotEmpty(message = "{section.required}")
    private String section;

    public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public boolean isFirstAttempt() {
		return firstAttempt;
	}

	public void setFirstAttempt(boolean firstAttempt) {
		this.firstAttempt = firstAttempt;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@NotEmpty(message = "{country.required}")
    private String country;

    private boolean firstAttempt;

    @NotNull(message = "{subjects.required}")
    @Size(min = 1, message = "{subjects.required}")
    private List<String> subjects;

    // Getters and Setters...
}
