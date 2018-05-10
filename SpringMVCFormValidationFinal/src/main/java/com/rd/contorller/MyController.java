package com.rd.contorller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rd.model.Customer;
import com.rd.model.Employee;

@Controller
public class MyController {
	@Autowired
	@Qualifier("employeeValidator")
	private Validator validator;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}// initBinder

	@InitBinder
	private void initBinderForEmployee(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@RequestMapping("home.htm")
	public String showHome() {
		return "home";
	}// showHome

	@RequestMapping("customerForm.htm")
	public String showCustomerForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customerForm";
	}// showCustomerForm

	@RequestMapping("customerSave.htm")
	public String proceedCustomerForm(@Valid @ModelAttribute("customer") Customer customer,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "customerForm";

		} // if
		else {
			return "customerSave";
		} // else

	}// proceedCustomerForm

	@RequestMapping("employeeForm.htm")
	public String showEmployeeForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "employeeForm";
	}// showEmployeeForm

	@RequestMapping("employeeSave.htm")
	public String proceedEmployeeForm(@Valid @ModelAttribute("employee") Employee employee,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "employeeForm";
		} else {
			return "employeeSave";
		}
	}// proceedEmployeeForm
}
