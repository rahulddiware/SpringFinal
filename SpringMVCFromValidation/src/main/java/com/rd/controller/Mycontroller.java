package com.rd.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rd.model.Customer;

@Controller
public class Mycontroller {
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}// dataBinder

	@RequestMapping("home.htm")
	public String showHome() {
		return "home";
	}// showForm

	@RequestMapping("form.htm")
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "form";
	}// showForm

	@RequestMapping("success.htm")
	public String proceedForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "form";
		} else {
			return "success";
		}

	}// proceedForm

}
