package com.smart.service;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smart.dao.UserMapper;
import com.smart.domain.User;

/**
* @author : gaoweibupt
* Date:2016年3月27日下午9:08:56
*/
@Service("userService")
@Transactional
public class UserService implements UserServiceInf{
	private Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	@Qualifier("userMapper")
	private UserMapper userMapper;
	
	public User selectUserByPrimaryKey(String userId){
		if (userId == null || userId == ""){
			logger.debug("userId 为空");
		}
		return userMapper.selectUserByPrimaryKey(userId);
	}
	
	public List<User> selectAll(){
		return userMapper.selectAllUser();
	}
	
}
