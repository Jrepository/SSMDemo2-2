package indi.ssm.controller;

import indi.ssm.pojo.User;
import indi.ssm.service.UserService;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	
	@RequestMapping("/first")
	public String first(){
		return "first";
	}

	@RequestMapping("/getUser")
	public String getUsers(Model model){
		User user = userService.selectUser().get(0);
		model.addAttribute("user", user);
		return "first";
	}
}
