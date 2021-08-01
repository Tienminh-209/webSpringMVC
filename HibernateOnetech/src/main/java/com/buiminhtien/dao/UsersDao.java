package com.buiminhtien.dao;

import com.buiminhtien.model.User;
import java.util.List;

public interface UsersDao {
	public void addUser(User user);

	public void updateUser(User user);

	public List<User> listUser();

	public User getUserById(int id);

	public User getUser(User user);

	public User getUserbyUsername(String username);

	public void removeUser(int id);

}
