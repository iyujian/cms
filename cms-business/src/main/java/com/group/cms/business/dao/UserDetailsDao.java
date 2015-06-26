package com.group.cms.business.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.group.cms.business.entity.UserDetails;
import com.group.cms.core.dao.BaseDao;

@Repository
public interface UserDetailsDao extends BaseDao<UserDetails, String> {

	@SelectKey(before = true, keyProperty = "id", resultType = String.class, statement = { "SELECT UPPER(REPLACE(UUID(), '-' , ''))" })
	@Insert("INSERT INTO cms_user_details (id, realname, nickname, user_id, creator_id, created_time, modifier_id, modified_time) VALUES (#{id}, #{realname}, #{nickname}, #{user_id}, #{creatorId}, #{createdTime}, #{modifierId}, #{modifiedTime})")
	public int insert(UserDetails userDetails);
	
	@Update("UPDATE cms_user_details SET realname = #{realname}, nickname = #{nickname}, user_id = #{user_id}, creator_id = ${creatorId}, created_time = ${createdTime}, modifier_id = ${modifierId}, modified_time = ${modifiedTime} WHERE id = #{id}")
	public int update(UserDetails userDetails);
	
	@Delete("DELETE FROM cms_user_details WHERE id = #{id}")
	public int delete(String id);
	
	@Delete("DELETE FROM cms_user_details WHERE ${name} ${operator} #{value}")
	public int deleteBy(@Param("name") String name, @Param("operator") String operator, @Param("value") String value);
	
	@Select("SELECT * FROM cms_user_details WHERE id = #{id}")
	public UserDetails select(String id);
	
}
