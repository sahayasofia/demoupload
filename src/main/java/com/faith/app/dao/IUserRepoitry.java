package com.faith.app.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.User;
@Repository 
public interface IUserRepoitry extends CrudRepository<User, Integer> {
	
	//custom method using JPQL
	@Query("from User where userName=?1 and passWord=?2 and isActive=true")
	public User findUserByUsernameAndPassword(String userName,String passWord);
	
 
}
