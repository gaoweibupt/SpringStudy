package com.smart.service;

import java.util.List;

import com.smart.domain.User;

/**
* @author : gaoweibupt
* Date:2016年3月28日上午11:13:13
*/
public interface UserServiceInf {
	public User selectUserByPrimaryKey(String userId);
	
	public List<User> selectAll();
}
