package com.example.thymeleaf.view.resolver.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping("/")
	public String redirect() {
		return "modules/main";
	}
	
	@RequestMapping("/emp/all")
	public String redirectToList(Model model) {
		List<Long> empList = new ArrayList<>();
		
		model.addAttribute("empList",empList);
		return "modules/emp";
	}
}
