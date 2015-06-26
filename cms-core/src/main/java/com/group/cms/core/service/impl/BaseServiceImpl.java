package com.group.cms.core.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.group.cms.core.dao.BaseDao;
import com.group.cms.core.entity.impl.BaseEntityImpl;
import com.group.cms.core.service.BaseService;

public abstract class BaseServiceImpl<T extends BaseEntityImpl, ID extends Serializable> implements BaseService {
	
	@Autowired
	private BaseDao<T, ID> dao;
	
	protected void beforeSave(T entity) {}

    protected void afterSave(T entity) {}
    
    protected void beforeDelete(ID id) {}
    
    protected void afterDelete(ID id) {}
    
    public boolean save(T entity) {
    	
    	try {
    		beforeSave(entity);
    		if(entity.getId()==null) {
    			dao.insert(entity);
    		} else {
    			dao.update(entity);
    		}
        	afterSave(entity);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
    	return true;
    }
    
    public boolean delete(ID id) {
    	try {
    		beforeDelete(id);
        	dao.delete(id);
        	afterDelete(id);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
    	return true;
    }
    
    public boolean delete(String name, String operator, String value) {
    	try {
        	dao.deleteBy(name, operator, value);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
    	return true;
    }
    
    @Transactional(readOnly=true)
    public T findById(ID id) {
    	return dao.select(id);
    }
    
    @Transactional(readOnly=true)
    public List<T> findBy(String name, String operator, String value) {
    	return dao.findBy(name, operator, value);
    }
    
    @Transactional(readOnly=true)
    public T findUniqueBy(String name, String operator, String value) {
    	List<T> list = dao.findBy(name, operator, value);
    	if(list!=null && list.size()>0) {
    		return list.get(0);
    	} else {
    		return null;
    	}
    }
    
}
