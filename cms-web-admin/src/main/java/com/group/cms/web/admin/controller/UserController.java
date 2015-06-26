package com.group.cms.web.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.group.cms.business.entity.User;
import com.group.cms.business.service.UserService;
import com.group.cms.core.controller.impl.BaseControllerImpl;

@Controller
@RequestMapping(value="user")
public class UserController extends BaseControllerImpl {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="")
	public String index(Model model) {
		model.addAttribute("users", userService.findAll());
		return "user/index";
	}
	
	@RequestMapping(value="save", method = RequestMethod.GET)
	public String save(User user) {
		userService.save(user);
		return "user/index";
	}
	
}
