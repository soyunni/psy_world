package com.psyworld.comm.login.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psyworld.comm.user.service.model.User;

@Controller
public class LoginController {

	@RequestMapping("/login/loginUser.sw")
	public String getUserLogin(Model model) {
		model.addAttribute("index", "START!!!");
		return "login/login"; //properties에서 설정한 context(/WEB-INF/jsp/) 하위에 위치한 index.jsp 파일(.jsp생략)을 노출 
	}
	
	@RequestMapping("/login/userInfo.sw")
	public String getUserInfo(User user) {
		System.out.println("================= ");
		System.out.println(user);
		return "redirect:/main/main.sw";
	}
}
