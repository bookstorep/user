package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	UserRepository userRepository;	
	@Override
	public User addUser(User user) throws Exception {
		// TODO Auto-generated method stub
		User savedUser=userRepository.save(user);
		return savedUser;
	}

	@Override
	public List<User> getAllUSer() throws Exception {
		List<User> allUsers=userRepository.findAll();
		return allUsers;
		
		
	}

	@Override
	public User updateUserByUserId(int userId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUserByUserId(int userId) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeOne(int userId) throws Exception {
	
		userRepository.deleteById(userId);
		
	}

}
