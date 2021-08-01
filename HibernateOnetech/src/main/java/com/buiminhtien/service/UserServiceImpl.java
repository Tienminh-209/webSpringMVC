package com.buiminhtien.service;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.buiminhtien.dao.UsersDao;
import com.buiminhtien.model.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UsersDao usersDAO;
	
	public void setUsersDao(UsersDao usersDAO) {
		this.usersDAO = usersDAO;
	}
	@Transactional
	public void addUser(User user) {
		//ma hoa
		user.setPassword(BCrypt.hashpw(user.getPassword(),BCrypt.gensalt(12)));
		this.usersDAO.addUser(user);
	}
	@Transactional
	public void updateUser(User user) {
		this.usersDAO.updateUser(user);
	}
	@Transactional
	public List<User> listUser() {
		return this.usersDAO.listUser();
	}
	@Transactional
	public User getUserById(int id) {
		return this.usersDAO.getUserById(id);
	}
	@Transactional
	public void removeUser(int id) {
		 this.usersDAO.removeUser(id);
	}
	@Transactional
	public User checkAccount(User user) {
		 String pass=user.getPassword();
		 user=this.usersDAO.getUser(user);
		 if(user!=null)
		 {
			 if(BCrypt.checkpw(pass, user.getPassword())) {
				 return user;
			 }else
			 {
				 return null;
			 }
		 }
		 return null;
	}
	@Transactional
	public User checkCreate(User user) {
		 String username=user.getPassword();
		 if(this.usersDAO.getUserbyUsername(username)==null)
		 {
			 return user;
		 }
		 return null;
	}
}