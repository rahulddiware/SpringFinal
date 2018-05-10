package com.rd.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.rd.validation.CourseCode;

public class Customer {
	@NotNull(message = "Must not Empty")
	private String firstName;
	@NotNull(message = "Must not Empty")
	private String lastName;
	@Email(message = "is Require")
	@NotNull(message = "Must not Empty")
	private String email;
	@Min(value = 3, message = "must be greater than 3")
	@Max(value = 10, message = "must be less than 10")
	@NotNull(message = "Must not Empty")
	private Integer freePasses;
	@NotNull(message = "Must not Empty")
	@Pattern(regexp = "^[0-9]{6}", message = "must be six digit postal code")
	private String postalCode;
	@CourseCode
	private String courseCode;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

}
