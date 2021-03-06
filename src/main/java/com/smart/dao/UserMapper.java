package com.smart.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.smart.domain.User;

/**
* @author : gaoweibupt
* Date:2016年3月27日下午8:34:35
*/
@Repository
@Transactional
public interface UserMapper {
	public User selectUserByPrimaryKey(String userId);
	
	public List<User> selectAllUser();
	
	public int insert(User user);
	
	public int deleteUserByPrimaryKey(String userId);
}
