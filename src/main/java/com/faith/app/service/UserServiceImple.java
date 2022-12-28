package com.faith.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faith.app.dao.IUserRepoitry;
import com.faith.app.entity.User;
@Service
public class UserServiceImple implements IUserService {
	
	
	//field Injuction
	
	@Autowired
	private IUserRepoitry userRepositry;

	@Override
	public User findByUserByNameandPassword(String userName, String passWord) {
		
		User user =userRepositry.findUserByUsernameAndPassword(userName, passWord);
		// TODO Auto-generated method stub
		if(userName.equals(user.getUserName())&&passWord.equals(user.getPassword())) {
			return user;
		}else {
			return null;
		}
		
		
		
	}

}
