package com.jd.dojosurveryproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveryController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/result")
	public String result(@RequestParam("name") String name, @RequestParam("dojo") String dojo, 
			@RequestParam("lang") String lang, @RequestParam("comment") String comment, Model model) {
		// take data and pass it to model to display info
		model.addAttribute("name", name);
		model.addAttribute("lang", lang);
		model.addAttribute("dojo", dojo);
		model.addAttribute("comment", comment);
		return "result.jsp";
	}
}
