package org.ecms.web.controller;

import org.ecms.integration.to.DBConfigTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SetupController {
	
	 @Autowired
	 private DBConfigTO dbConfig;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String setUp(ModelMap model) {
		System.out.println("Hello................"+dbConfig.getDbUserName());
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "home";
	}

}
