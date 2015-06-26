package com.group.cms.business.entity;

import com.group.cms.core.entity.impl.BaseEntityImpl;

/**
 * 栏目和文章关系实体
 * @author Yujian
 *
 */
public class CategoryPost extends BaseEntityImpl {
	
	private static final long serialVersionUID = 1L;

	private String categoryId;
	
	private String postId;

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}
	
}
