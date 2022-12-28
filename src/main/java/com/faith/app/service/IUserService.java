package com.faith.app.service;

import com.faith.app.entity.User;

public interface IUserService {
	
	//custom method using JpqL
	
	public User findByUserByNameandPassword(String userName,String passWord);
	

}
