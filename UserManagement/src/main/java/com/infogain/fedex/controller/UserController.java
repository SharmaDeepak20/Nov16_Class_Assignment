package com.infogain.fedex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infogain.fedex.model.User;
import com.infogain.fedex.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService usr;
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String addUser(@RequestParam String name, @RequestParam String desig)
	{
		usr.save(new User(name,desig));
		return "User with username= "+name+" is added";
	}//end addUser
	
	@RequestMapping(value="/deleteUser",method=RequestMethod.DELETE)
	public String deleteUser(@RequestParam int id)
	{
		usr.deleteUser(id);
		return "User with userId="+id+" is updated";
	}//end deleteUser
	
	@RequestMapping(value="/findAll",method=RequestMethod.GET)
	public List<User> findAll()
	{
		return usr.findAllUsers();
	}//end findAll
	
	@RequestMapping(value="/updateUser",method=RequestMethod.POST)
	public String updateUser(@RequestParam int id,@RequestParam String name)
	{
		usr.updateUser(id, name);
		return "Now, user with userId="+id+" have name="+name;
	}//end updateUser
}//end controller
