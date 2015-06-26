package com.group.cms.business.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.group.cms.business.entity.User;
import com.group.cms.core.dao.BaseDao;

@Repository
public interface UserDao extends BaseDao<User, String> {

	@SelectKey(before = true, keyProperty = "id", resultType = String.class, statement = { "SELECT UPPER(REPLACE(UUID(), '-' , ''))" })
	@Insert("INSERT INTO cms_user (id, username, password, email, salt, creator_id, created_time, modifier_id, modified_time) VALUES (#{id}, #{username}, #{password}, #{email}, #{salt}, #{creatorId}, #{createdTime}, #{modifierId}, #{modifiedTime})")
	public int insert(User user);
	
	@Update("UPDATE cms_user SET username = #{username}, password = #{password}, email = #{email}, salt = #{salt}, creator_id = ${creatorId}, created_time = ${createdTime}, modifier_id = ${modifierId}, modified_time = ${modifiedTime} WHERE id = #{id}")
	public int update(User user);
	
	@Delete("DELETE FROM cms_user WHERE id = #{id}")
	public int delete(String id);
	
	@Select("SELECT * FROM cms_user WHERE id = #{id}")
	public User select(String id);
	
	@Select("SELECT * FROM cms_user WHERE ${name} ${operator} #{value}")
	public List<User> selectBy(@Param("name") String name, @Param("operator") String operator, @Param("value") String value);
	
	@Select("SELECT * FROM cms_user")
	public List<User> selectAll();
	
}
