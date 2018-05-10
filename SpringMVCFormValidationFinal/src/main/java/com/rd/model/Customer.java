package com.rd.model;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.rd.validator.Phone;

public class Customer {
	@NotNull(message = "Please Enter Your Name")
	@Size(min = 3, max = 30)
	private String name;
	@NotNull(message = "Please Enter Your Email")
	@Email(message = "Enter Proper Email")
	private String email;
	@NotNull(message = "Enter your Age")
	@Min(18)
	@Max(40)
	private Integer age;
	@NotNull(message = "Select Your Gender")
	private Gender gender;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Past
	@NotNull(message = "Please Enter valid Birth Date")
	private Date date;
	@Phone
	private String phone;

	public enum Gender {
		MALE, FEMALE
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", age=" + age + ", gender=" + gender + ", date=" + date
				+ ", phone=" + phone + "]";
	}

}
