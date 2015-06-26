package com.group.cms.core.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T, ID extends Serializable> {

	/**
	 * insert
	 * @param entity
	 * @return 插入的行数
	 */
	int insert(T entity);
	
	/**
	 * update
	 * @param entity
	 * @return 修改的行数
	 */
	int update(T entity);
	
	/**
	 * delete
	 * @param id
	 * @return 删除的行数
	 */
	int delete(ID id);
	
	/**
	 * 
	 * @param name
	 * @param operator
	 * @param value
	 * @return
	 */
	int deleteBy(String name, String operator, String value);
	
	/**
	 * select
	 * @param id
	 * @return
	 */
	T select(ID id);
	
	/**
	 * 
	 * @param name
	 * @param operator
	 * @param value
	 * @return
	 */
	List<T> findBy(String name, String operator, String value);
}
