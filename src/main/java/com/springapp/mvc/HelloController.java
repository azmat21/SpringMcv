package com.springapp.mvc;

import com.springapp.entity.User;
import com.springapp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping("/")
public class HelloController {

	@Resource(name = "userServiceImpl")
	private UserService userService;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		User user = userService.get(1);
		model.addAttribute("message", user.getName());
		return "hello";
	}

}