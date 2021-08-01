package com.buiminhtien.service;

import java.util.List;

import com.buiminhtien.model.User;

public interface UserService {
	public void addUser(User user);

	public void updateUser(User user);

	public List<User> listUser();

	public User getUserById(int id);

	public void removeUser(int id);
	
	public User checkAccount(User user);

	public User checkCreate(User user);
	

}
