package com.group.cms.business.entity;

import com.group.cms.core.entity.impl.BaseEntityImpl;

/**
 * 友情链接
 * @author Yujian
 *
 */
public class Link extends BaseEntityImpl {

	private static final long serialVersionUID = 1L;

	private String url;
	
	private String text;
	
	private String rel;
	
	private String title;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getRel() {
		return rel;
	}

	public void setRel(String rel) {
		this.rel = rel;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}