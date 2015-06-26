package com.group.cms.web.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group.cms.core.controller.impl.BaseControllerImpl;

@Controller
public class MainController extends BaseControllerImpl {
	
	@RequestMapping(value={"", "/"})
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="dashboard")
	public String dashboard() {
		return "dashboard/index";
	}
	
}