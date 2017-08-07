package com.patrick.controllerspractice.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	@RequestMapping("/world")
	public String world() {
		return "Class level annotations are cool too!";
	}
}
