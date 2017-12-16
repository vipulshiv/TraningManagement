package com.practice.scms.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.practice.scms.model.User;
import com.practice.scms.serviceImpl.UserRegistrationServiveImpl;
import com.practice.scms.validation.UserRqst;


@Controller
public class UserController {
	
@Autowired
UserRegistrationServiveImpl userRegistration;
	
@RequestMapping("/registrationform")
	
	public ModelAndView showdetails(Model model) {
		UserRqst registration = new UserRqst();
		model.addAttribute("registration", registration);
		return new ModelAndView("registrationform");
	}	

@RequestMapping(value="/register", method=RequestMethod.POST)
public ModelAndView processRegister(@ModelAttribute("registration")UserRqst userrqst ,BindingResult result) {
	
	System.out.println(userrqst.getLoginname());
	if(result.hasErrors()) {
		
		
	}
	userRegistration.registerUser(userrqst);
	
	
	return new ModelAndView("registrationsuccess");

	}

}
