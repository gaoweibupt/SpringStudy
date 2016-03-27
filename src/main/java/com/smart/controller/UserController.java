package com.smart.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smart.domain.User;
import com.smart.service.UserService;

/**
* @author : gaoweibupt
* Date:2016年3月27日下午9:20:54
*/
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public String showLogin(HttpServletRequest request, Model model){
		String userId = request.getParameter("userId");
		User user = userService.selectUserByPrimaryKey(userId);
		return "sucess";
	}
	
}
