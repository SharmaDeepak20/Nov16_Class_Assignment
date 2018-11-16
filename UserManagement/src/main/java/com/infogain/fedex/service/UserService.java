package com.infogain.fedex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogain.fedex.model.User;
import com.infogain.fedex.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository uri;
	
	public List<User> findAllUsers()
	{
		return (List<User>) uri.findAll();
	}//end findAllUsers
	
	public void save(User user)
	{
		uri.save(user);
	}//end save
	
	public void updateUser(int id,String name)
	{
		User user=uri.findOne(id);
		user.setName(name);
		uri.save(user);
	}//end updateUSer
	
	public void deleteUser(int id)
	{
		uri.delete(id);
	}//end deleteUser
}
