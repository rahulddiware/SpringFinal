package com.rd.command;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StudentRegisterCommand {
	@NotNull
	private Integer sno;
	@NotEmpty
	private String fname;
	@NotEmpty
	private String lname;
	@NotEmpty
	private String city;
	@NotEmpty
	@Email(message = "{email.invalid}")
	private String email;
	@NotEmpty
	@Size(min = 10, max = 10)
	private String mno;
	@NotEmpty
	private String userName;
	@NotEmpty
	private String password;
}
