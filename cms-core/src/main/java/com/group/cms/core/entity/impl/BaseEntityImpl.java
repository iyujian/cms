package com.group.cms.core.entity.impl;

import java.io.Serializable;
import java.util.Date;

import com.group.cms.core.entity.BaseEntity;

public class BaseEntityImpl implements BaseEntity, Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private Date createdTime;
	
	private String creatorId;
	
	private Date modifiedTime;
	
	private String modifierId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getModifierId() {
		return modifierId;
	}

	public void setModifierId(String modifierId) {
		this.modifierId = modifierId;
	}
	
}
