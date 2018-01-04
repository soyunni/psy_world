package com.psyworld.comm.test.web;

import java.util.HashMap;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	@RequestMapping("/api/hello")
	public HashMap<String, Object> greet(Model model) {
		HashMap<String, Object> test = new HashMap<>();
		test.put("foo", "gggggggggggggggggggggggggggggg");
		model.addAttribute("x", test);
		return test;
	}
}
