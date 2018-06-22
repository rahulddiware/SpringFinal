package com.rd.command;

import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StudentLoginCommand {
	@NotEmpty
	private String userName;
	@NotEmpty
	private String password;

}
