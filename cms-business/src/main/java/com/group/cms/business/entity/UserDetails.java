package com.group.cms.business.entity;

import com.group.cms.core.entity.impl.BaseEntityImpl;

/**
 * 用户详细信息
 * @author Yujian
 *
 */
public class UserDetails extends BaseEntityImpl {

	private static final long serialVersionUID = 1L;
	
	private String realname;
	
	private String nickname;

	private String userId;
	
	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
