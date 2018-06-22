package com.rd.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StudentRegisterDTO {
	private int sno;
	private String fname;
	private String lname;
	private String city;
	private String email;
	private String mno;
	private String userName;
	private String password;

}
