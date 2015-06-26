package com.group.cms.business.entity;

import com.group.cms.core.entity.impl.BaseEntityImpl;

/**
 * 文章详细
 * @author Yujian
 *
 */
public class PostDetails extends BaseEntityImpl {
	
	private static final long serialVersionUID = 1L;

	private String title;
	
	private String metaKeywords;
	
	private String metaDescription;
	
	private String postId;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMetaKeywords() {
		return metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getMetaDescription() {
		return metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}
	
}
