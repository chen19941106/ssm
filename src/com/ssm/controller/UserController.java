package com.ssm.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.pojo.UserBean;
import com.ssm.service.UserService;

@Controller
public class UserController {
	@Autowired UserService userService;
	
	@RequestMapping("/into")
	public String into(HttpServletRequest req){
		UserBean user=userService.getUserById(1);
		req.setAttribute("user", user);
		return "into";
	}
}
