package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	@PostMapping("/add")
	public ResponseEntity<String> addUser(@RequestBody User user) 
	{
		/*
		 * // request body annotation  , help u 
		 * to take user information as JSON , so it convert JSON object to AppIser Object
		 * */
		try {
			User savedUser =  userService.addUser(user);
			String responseMsg = savedUser.getUserName()+" save with Id "+savedUser.getUserId();
			 //mylogs.info("A value is added ");
			return new ResponseEntity<String>(responseMsg,HttpStatus.OK);
		} catch (Exception e) {
			String errorMsg =  "Contact to customer care 1800-250-960 or mail us :- care@capg.com";
			return new ResponseEntity<String>(errorMsg,HttpStatus.INTERNAL_SERVER_ERROR);
		}	
	}
	@GetMapping("/users")
	public List<User> getAllUsers()
	{
		try
		{
			List<User> allExtractedUsers=userService.getAllUSer();
			return allExtractedUsers;
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
		
	}
	/*@RequestMapping("/updateuser")
	public String updateUser(@RequestParam int userId,User user1)
	{
		User user=userService.findOne(userId);
		user.addAttribute("user1",user);
		return "updateUser";
	}
	@GetMapping("delete/{userId}")
  public String deleteUSer(@PathVariable int userId,User user)
  {
		
  }*/
}
		