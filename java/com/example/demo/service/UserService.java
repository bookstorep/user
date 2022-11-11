package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;



@Service
public interface UserService {
	public User addUser(User user) throws Exception;
	public List<User> getAllUSer() throws Exception;
	public User updateUserByUserId(int userId) throws Exception;
	public void deleteUserByUserId(int userId) throws Exception;
	public void removeOne(int userId) throws Exception;

}
