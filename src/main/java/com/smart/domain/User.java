package com.smart.domain;
/**
* @author : gaoweibupt
* Date:2016年3月27日下午7:50:04
*/
public class User {
	private String userId;
	
	private String userName;
	
	private String password;
	
	private String md5pass;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMd5pass() {
		return md5pass;
	}

	public void setMd5pass(String md5pass) {
		this.md5pass = md5pass;
	}
	
	
}
