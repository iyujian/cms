package com.group.cms.business.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.Operator;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.group.cms.business.dao.UserDao;
import com.group.cms.business.dao.UserDetailsDao;
import com.group.cms.business.entity.User;
import com.group.cms.business.util.PasswordUtil;
import com.group.cms.business.util.UserUtil;
import com.group.cms.core.service.BaseService;
import com.group.cms.core.service.impl.BaseServiceImpl;

@Service
@Transactional
public class UserService extends BaseServiceImpl<User, String> implements BaseService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Override
	protected void beforeSave(User entity) {
		
		String username = entity.getUsername();
		
		if(username!=null && this.findByUsername(username)==null) {
			Date date = new Date();
			if(entity.getId() == null) {
				Map<String, String> map = PasswordUtil.encrypt(entity.getPassword());
				entity.setSalt(map.get("salt"));
				entity.setPassword(map.get("password"));
				entity.setCreatedTime(date);
				entity.setCreatorId(UserUtil.getCurrentUser().getId());
			} else {
				entity.setModifiedTime(date);
				entity.setModifierId(UserUtil.getCurrentUser().getId());
			}
		} else {
			try {
				throw new Exception("重复的用户名");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	protected void afterSave(User entity) {
		userDetailsService.save(entity.getUserDetails());
	}
	
	@Override
	protected void beforeDelete(String id) {
		userDetailsService.delete("user_id", "=", id);
	}

	public User findByUsername(String username) {
		return userDao.selectBy("username", "=", username).get(0);
	}

	public List<User> findAll() {
		return userDao.selectAll();
	}
}
