package com.psyworld.comm.content.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psyworld.comm.user.service.model.User;

@Controller
public class MainController {

	@RequestMapping("/main/main.sw")
	public String getUserInfo(User user) {
		System.out.println("========== MAIN ======= ");
		System.out.println("========== MAIN ======= ");
		return "/main/main";
	}
}
