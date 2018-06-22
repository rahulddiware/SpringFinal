package com.rd.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rd.command.StudentLoginCommand;
import com.rd.command.StudentRegisterCommand;
import com.rd.dto.StudentLoginDTO;
import com.rd.dto.StudentRegisterDTO;
import com.rd.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);

	}// intiBinder

	@RequestMapping("/home.htm")
	public String showHome() {
		return "home";
	}

	@RequestMapping(value = "/login.htm", method = RequestMethod.GET)
	public String login(@ModelAttribute("stLoginCmd") StudentRegisterCommand command) {
		return "login";
	}// login

	@RequestMapping(value = "/register.htm")
	public String showRegister(@ModelAttribute("stRegisterCmd") StudentRegisterCommand command) {
		return "register";
	}// login

	@RequestMapping(value = "login.htm", method = RequestMethod.POST)
	public String processLogin(Map<String, Object> map,
			@Valid @ModelAttribute("stLoginCmd") StudentLoginCommand loginCommand, BindingResult errors) {
		StudentLoginDTO loginDTO = null;
		String result = null;
		// form validation related login
		if (errors.hasErrors()) {
			return "login";
		} // if
			// copy command to dto
		loginDTO = new StudentLoginDTO();
		BeanUtils.copyProperties(loginCommand, loginDTO);
		result = service.AuthenticateUser(loginDTO);
		map.put("resultMessage", result);
		if (result.equalsIgnoreCase("Student Login Failed "))
			return "login";
		else
			return "result";
	}// process Login

	@RequestMapping(value = "register.htm", method = RequestMethod.POST)
	public String processRegistration(Map<String, Object> map,
			@Valid @ModelAttribute("stRegisterCmd") StudentRegisterCommand registerCommand, BindingResult errors) {
		StudentRegisterDTO registerDTO = null;
		String result = null;
		if (errors.hasErrors()) {
			return "register";
		}
		// copy command to dto
		registerDTO = new StudentRegisterDTO();
		BeanUtils.copyProperties(registerCommand, registerDTO);
		result = service.registerStudent(registerDTO);
		map.put("resultMessage", result);
		return "result";

	}
}
