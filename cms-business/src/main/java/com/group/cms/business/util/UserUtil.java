package com.group.cms.business.util;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import com.group.cms.business.entity.User;
import com.group.cms.business.service.UserService;

public class UserUtil {
	
	@Autowired
	private UserService userService;

	public static User getCurrentUser() {
		
		Subject subject = SecurityUtils.getSubject();
		
		return new User();
		
	}
	
	public static String getCurrentUsername() {
		return String.valueOf(SecurityUtils.getSubject().getPrincipal());
	}
}
