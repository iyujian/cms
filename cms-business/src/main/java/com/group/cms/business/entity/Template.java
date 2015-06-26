package com.group.cms.business.entity;

import com.group.cms.core.entity.impl.BaseEntityImpl;

/**
 * 模版
 * @author Yujian
 *
 */
public class Template extends BaseEntityImpl {
	
	private static final long serialVersionUID = 1L;
	
	private String location;
	
	private String name;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
